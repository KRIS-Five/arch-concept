package ee.rik.kris5.application.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import ee.rik.kris5.application.client.ItemServiceClient;
import ee.rik.kris5.application.model.Decree;
import ee.rik.kris5.application.model.Item;
import ee.rik.kris5.application.model.Status;
import ee.rik.kris5.application.repository.DecreeRepository;
import ee.rik.kris5.application.repository.GenerationRepository;
import ee.rik.kris5.application.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class ProcessingService {

    @Autowired
    private DecreeRepository decreeRepository;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private GenerationRepository generationRepository;
    @Autowired
    private ItemServiceClient itemServiceClient;

    @Scheduled(fixedRate = 5000)
    public void checkForCreatedOrInProcessDecree() {

        Decree decree = decreeRepository.findFirstByStatus(Status.CREATED);
        if (decree != null) {
            processItemGeneration(decree.getId(), decree.getNumberOfItems());
            markDecreeForProcessing(decree);
        }
    }

    @Scheduled(fixedRate = 5000)
    public void checkAndProcessDecree() {

        Decree decree = decreeRepository.findFirstByStatus(Status.PROCESSING);

        if (decree != null) {
            PageRequest selection = new PageRequest(0, 10000);
            List<Item> items = itemRepository.findByDecreeIdAndStatus(decree.getId(), Status.READY_TO_PROCESS, selection);
            if (items != null && items.size() > 0) {
                processItems(items);
            } else {
                markDecreeProcessingFinished(decree);
            }
        }
    }

    private void markDecreeProcessingFinished(Decree decree) {
        decree.setStatus(Status.PROCESSED);
        decree.setFinalizedDate(new Date());
        decreeRepository.save(decree);
    }

    @HystrixCommand
    private void processItems(List<Item> items) {
        for (Item item : items) {
            try {
                processItem(item.getId());
            } catch (Exception ex) {
                item.setStatus(Status.FAILED);
                itemRepository.save(item);
            }
        }
    }

    @HystrixCommand
    public void processItem(Long id) {
        itemServiceClient.processItem(id);
    }


    private void markDecreeForProcessing(Decree decree) {
        decree.setStatus(Status.PROCESSING);
        decreeRepository.save(decree);
    }

    private void processItemGeneration(Long id, Integer numberOfItems) {
        generationRepository.generateItems(numberOfItems, id);
    }


}
