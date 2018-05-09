package ee.rik.kris5.item.repository;

import ee.rik.kris5.item.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    @Query(nativeQuery=true, value="SELECT * FROM person ORDER BY random() LIMIT 1")
    Person findFirstByRandom();
}
