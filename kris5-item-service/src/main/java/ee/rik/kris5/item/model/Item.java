package ee.rik.kris5.item.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.AUTO;


@Table(name="item")
@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(name = "decree_id")
    private Long decreeId;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;
    @Column(name = "registry_part_id")
    private Long registryPartId;
    @Column(name = "owner_person_id")
    private Long ownerPersonId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDecreeId() {
        return decreeId;
    }

    public void setDecreeId(Long decreeId) {
        this.decreeId = decreeId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getRegistryPartId() {
        return registryPartId;
    }

    public void setRegistryPartId(Long registryPartId) {
        this.registryPartId = registryPartId;
    }

    public Long getOwnerPersonId() {
        return ownerPersonId;
    }

    public void setOwnerPersonId(Long ownerPersonId) {
        this.ownerPersonId = ownerPersonId;
    }
}
