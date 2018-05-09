package ee.rik.kris5.application.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import static javax.transaction.Transactional.TxType.REQUIRED;

@Repository
public class GenerationRepositoryImpl implements GenerationRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(REQUIRED)
    public void generatePersons(Integer numberToGenerate) {
        Query query = em.createNamedQuery("Person.generatePersons")
                .setParameter(1, numberToGenerate);
        query.setFlushMode(FlushModeType.COMMIT);
        query.executeUpdate();
    }

    @Override
    @Transactional
    public void generateRegistryParts(int numberToGenerate) {
        Query query = em.createNamedQuery("RegistryPart.generateRegistryParts")
                .setParameter(1, numberToGenerate);
        query.setFlushMode(FlushModeType.COMMIT);
        query.executeUpdate();
    }

    @Transactional
    @Override
    public void generateItems(Integer numberToGenerate, Long decreeId) {
        Query query = em.createNamedQuery("Item.generateItems")
                .setParameter(1, decreeId)
                .setParameter(2, numberToGenerate);
        query.setFlushMode(FlushModeType.COMMIT);
        query.executeUpdate();
    }

}
