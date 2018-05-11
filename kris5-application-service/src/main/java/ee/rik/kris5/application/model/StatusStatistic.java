package ee.rik.kris5.application.model;

public class StatusStatistic {

    private Status status;
    private Long count;

    public StatusStatistic(Status status, Long count) {
        this.status = status;
        this.count = count;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
