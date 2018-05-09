package ee.rik.kris5.application.service;


import ee.rik.kris5.application.model.GeneratedDataAmount;
import ee.rik.kris5.application.repository.GenerationRepository;
import ee.rik.kris5.application.repository.PersonRepository;
import ee.rik.kris5.application.repository.RegistryPartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerationService {

    @Autowired
    GenerationRepository generationRepository;
    @Autowired
    PersonRepository personRepository;
    @Autowired
    RegistryPartRepository registryPartRepository;

    public GeneratedDataAmount getGeneratedDataAmount() {
        return new GeneratedDataAmount(registryPartRepository.count(), personRepository.count());
    }

    public void generatePersons(int numberOfRegParts) {
        generationRepository.generatePersons(numberOfRegParts);
    }

    public void generateRegistryParts(int numberOfRegParts) {
        generationRepository.generateRegistryParts(numberOfRegParts);
    }
}
