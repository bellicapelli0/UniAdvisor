package api;

public class apiresponse {
    private final long id;
    private final location location;

    public apiresponse(long id, api.location location) {
        this.id = id;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public api.location getLocation() {
        return location;
    }
}
