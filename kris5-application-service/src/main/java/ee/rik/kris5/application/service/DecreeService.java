package ee.rik.kris5.application.service;

import ee.rik.kris5.application.model.Decree;
import ee.rik.kris5.application.model.Status;
import ee.rik.kris5.application.model.StatusCounts;
import ee.rik.kris5.application.model.StatusStatistic;
import ee.rik.kris5.application.repository.DecreeRepository;
import ee.rik.kris5.application.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class DecreeService {

    @Autowired
    private DecreeRepository decreeRepository;
    @Autowired
    private ItemRepository itemRepository;

    public List<Decree> getDecrees() {
        Pageable top = new PageRequest(0, 10);
        return getCounts(decreeRepository.findAllByOrderByCreateDateDesc(top));
    }

    private List<Decree> getCounts(List<Decree> decrees) {

        List<Decree> modifiedDecrees = new ArrayList<Decree>();

        for (Decree decree : decrees) {
            StatusCounts counts = new StatusCounts();

            List<StatusStatistic> statistics = itemRepository.findStatistics(decree.getId());

            for (StatusStatistic stat : statistics) {
                if (stat.getStatus() == Status.ACTIVE) {
                    counts.setActiveItems(counts.getActiveItems() + stat.getCount());
                }
                if (stat.getStatus() == Status.CLOSED) {
                    counts.setActiveItems(counts.getActiveItems() + stat.getCount());
                }
                if (stat.getStatus() == Status.READY_TO_PROCESS) {
                    counts.setReadyToProcessItems(stat.getCount());
                }
                if (stat.getStatus() == Status.FAILED) {
                    counts.setFailedItems(stat.getCount());
                }
            }

            decree.setCounts(counts);
            if (decree.getFinalizedDate() != null) {
                decree.setProcessingTime(getProcessingTime(getDateDiff(decree.getCreateDate(), decree.getFinalizedDate(), TimeUnit.SECONDS)));
            }
            modifiedDecrees.add(decree);
        }

        return modifiedDecrees;
    }

    public void saveDecree(int numberToGenerate) {

        Decree decree = new Decree(numberToGenerate, Status.CREATED);
        decree.setCreateDate(new Date());
        decreeRepository.save(decree);
    }

    private static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }

    private String getProcessingTime(long duration) {
        long days = TimeUnit.SECONDS.toDays(duration);
        duration -= TimeUnit.DAYS.toSeconds(days);

        long hours = TimeUnit.SECONDS.toHours(duration);
        duration -= TimeUnit.HOURS.toSeconds(hours);

        long minutes = TimeUnit.SECONDS.toMinutes(duration);
        duration -= TimeUnit.MINUTES.toSeconds(minutes);

        long seconds = TimeUnit.SECONDS.toSeconds(duration);

        StringBuilder msg = new StringBuilder();
        if (days != 0) {
            msg.append(days + " day(s)");
        }
        if (hours != 0) {
            msg.append(hours + " hours(s)");
        }
        if (minutes != 0) {
            msg.append(minutes + " minutes(s)");
        }
        if (seconds != 0) {
            msg.append(seconds + " seconds(s)");
        }
        return msg.toString();
    }
}
