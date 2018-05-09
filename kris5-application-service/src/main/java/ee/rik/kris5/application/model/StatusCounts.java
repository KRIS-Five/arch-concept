package ee.rik.kris5.application.model;

public class StatusCounts {

    private Long activeItems;
    private Long failedItems;
    private Long readyToProcessItems;


    public Long getActiveItems() {
        return activeItems;
    }

    public void setActiveItems(Long activeItems) {
        this.activeItems = activeItems;
    }

    public Long getFailedItems() {
        return failedItems;
    }

    public void setFailedItems(Long failedItems) {
        this.failedItems = failedItems;
    }

    public Long getReadyToProcessItems() {
        return readyToProcessItems;
    }

    public void setReadyToProcessItems(Long readyToProcessItems) {
        this.readyToProcessItems = readyToProcessItems;
    }
}
