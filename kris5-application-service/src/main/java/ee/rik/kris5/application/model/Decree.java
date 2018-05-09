package ee.rik.kris5.application.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "decree")
public class Decree implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;
    @Column(name = "finalized_date")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date finalizedDate;
    @Column(name="number_of_items")
    private Integer numberOfItems;

    @Transient
    private StatusCounts counts;
    @Transient
    private String processingTime;

    public Decree(Long id, Date createDate, Status status, Date finalizedDate, Integer numberOfItems) {
        this.id = id;
        this.createDate = createDate;
        this.status = status;
        this.finalizedDate = finalizedDate;
        this.numberOfItems = numberOfItems;
    }

    public Decree(Integer numberOfItems, Status status){
        this.numberOfItems = numberOfItems;
        this.status = status;
    }

    public Decree() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getFinalizedDate() {
        return finalizedDate;
    }

    public void setFinalizedDate(Date finalizedDate) {
        this.finalizedDate = finalizedDate;
    }

    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public StatusCounts getCounts() {
        return counts;
    }

    public void setCounts(StatusCounts counts) {
        this.counts = counts;
    }

    public String getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(String processingTime) {
        this.processingTime = processingTime;
    }
}
