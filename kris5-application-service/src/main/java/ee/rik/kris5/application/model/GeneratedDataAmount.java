package ee.rik.kris5.application.model;


public class GeneratedDataAmount {

    private Long numberOfRegistryParts;
    private Long numberOfPersons;

    public GeneratedDataAmount(Long numberOfRegistryParts, Long numberOfPersons) {
        this.numberOfRegistryParts = numberOfRegistryParts;
        this.numberOfPersons = numberOfPersons;
    }

    public Long getNumberOfRegistryParts() {
        return numberOfRegistryParts;
    }

    public void setNumberOfRegistryParts(Long numberOfRegistryParts) {
        this.numberOfRegistryParts = numberOfRegistryParts;
    }

    public Long getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(Long numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }
}
