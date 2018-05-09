package ee.rik.kris5.application.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface GenerationRepository {

    void generatePersons(Integer numberToGenerate);

    void generateRegistryParts(int numberOfRegParts);

    void generateItems(Integer numberToGenerate, Long decreeId);
}
