package ee.rik.kris5.application.model;

public enum Status {
    CREATED,
    READY_TO_PROCESS,
    PROCESSING,
    GENERATING_ITEMS,
    PROCESSED,
    FAILED,
    ACTIVE,
    CLOSED
    ;


    public static Status getEnum(String name) {
        for(Status v : values())
            if(v.name().equalsIgnoreCase(name)) return v;
        throw new IllegalArgumentException();
    }
}
