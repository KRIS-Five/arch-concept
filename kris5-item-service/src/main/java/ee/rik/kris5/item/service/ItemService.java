package ee.rik.kris5.item.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import ee.rik.kris5.item.model.Item;
import ee.rik.kris5.item.model.Person;
import ee.rik.kris5.item.model.Status;
import ee.rik.kris5.item.repository.ItemRepository;
import ee.rik.kris5.item.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private PersonRepository personRepository;

    @HystrixCommand
    public void processItem(Long id) {
        Item item = itemRepository.findFirstById(id);
        Person person = personRepository.findFirstByRandom();
        closePreviousActiveItems(item.getRegistryPartId());
        item.setOwnerPersonId(person.getId());
        item.setStatus(Status.ACTIVE);
        itemRepository.save(item);
    }

    private void closePreviousActiveItems(Long registryPartId) {
        List<Item> activeItems = itemRepository.findAllByRegistryPartIdAndStatus(registryPartId, Status.ACTIVE);
        for(Item item : activeItems){
            item.setStatus(Status.CLOSED);
            itemRepository.save(item);
        }
    }
}
