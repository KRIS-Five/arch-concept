package ee.rik.kris5.item.model;

public enum Status {
    CREATED,
    PROCESSED,
    FAILED,
    READY_TO_PROCESS,
    PROCESSING,
    ACTIVE,
    CLOSED
    ;



    public static Status getEnum(String name) {
        for(Status v : values())
            if(v.name().equalsIgnoreCase(name)) return v;
        throw new IllegalArgumentException();
    }
}
