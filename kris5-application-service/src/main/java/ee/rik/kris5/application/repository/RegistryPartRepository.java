package ee.rik.kris5.application.repository;

import ee.rik.kris5.application.model.RegistryPart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistryPartRepository extends CrudRepository<RegistryPart, Long> {


}
