package ee.rik.kris5.application.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name="registry_part")
@NamedNativeQueries(
        value={
                @NamedNativeQuery(
                        name = "RegistryPart.generateRegistryParts",
                        query = "INSERT INTO registry_part(part_uid)" +
                                " SELECT" +
                                " substring(id || md5(random()\\:\\:TEXT), 0, 32) AS part_uid" +
                                " FROM generate_series(1,?) id"
                )
        }
)
public class RegistryPart {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(name="part_uid")
    String partUid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartUid() {
        return partUid;
    }

    public void setPartUid(String partUid) {
        this.partUid = partUid;
    }
}
