package ee.rik.kris5.application.repository;

import ee.rik.kris5.application.model.Item;
import ee.rik.kris5.application.model.Status;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

    List<Item> findByDecreeIdAndStatus(Long decreeId, Status status, Pageable pageable);

    @Query("SELECT count(i) FROM Item i WHERE i.decreeId =:decreeId AND (i.status =:statusOne OR i.status=:statusTwo)")
    Long countAllByDecreeIdAndStatusOrStatus(@Param("decreeId")Long decreeId, @Param("statusOne") Status statusOne, @Param("statusTwo") Status statusTwo);

    Long countAllByDecreeIdAndStatus(Long decreeId, Status status);
}
