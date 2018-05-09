package ee.rik.kris5.application.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;


@Table(name="item")
@NamedNativeQueries(
        value={
                @NamedNativeQuery(
                        name = "Item.generateItems",
                        query = "INSERT INTO item (registry_part_id, decree_id, create_date, status) (" +
                "SELECT id, ?, now(), 'READY_TO_PROCESS' FROM registry_part ORDER BY RANDOM() LIMIT ?);"
                )
        }
)
@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(name = "decree_id")
    private Long decreeId;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

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
}
