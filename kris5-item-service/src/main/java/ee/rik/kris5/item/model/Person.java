package ee.rik.kris5.item.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(name="personal_code")
    String personalCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
