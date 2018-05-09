package ee.rik.kris5.application.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name="person")
@NamedNativeQueries(
        value={
                @NamedNativeQuery(
                        name = "Person.generatePersons",
                        query = "INSERT INTO person (personal_code)" +
                                "    SELECT" +
                                "    substring(id || md5(random()\\:\\:TEXT), 0, 32) AS personal_code" +
                                "    FROM generate_series(1,?) id;"
                )
        }
)
public class Person {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(name="personal_code")
    String personalCode;

}
