package ee.rik.kris5.item.model;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "registry_part")
public class RegistryPart implements Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(name = "part_uid")
    private String registry_part_uuid;

}
