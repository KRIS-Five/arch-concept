package ee.rik.kris5.application.repository;

import ee.rik.kris5.application.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {


}
