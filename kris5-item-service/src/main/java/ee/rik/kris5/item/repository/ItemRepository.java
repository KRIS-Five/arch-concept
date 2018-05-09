package ee.rik.kris5.item.repository;

import ee.rik.kris5.item.model.Item;
import ee.rik.kris5.item.model.Status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

    Item findFirstById(Long id);

    List<Item> findAllByRegistryPartIdAndStatus(Long registry_part_id, Status status);
}
