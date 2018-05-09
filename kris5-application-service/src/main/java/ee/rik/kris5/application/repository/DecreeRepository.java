package ee.rik.kris5.application.repository;

import ee.rik.kris5.application.model.Decree;
import ee.rik.kris5.application.model.Status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DecreeRepository extends CrudRepository<Decree, Long> {

    Decree findFirstByStatus(Status status);

    List<Decree> findAllByOrderByCreateDateDesc();
}
