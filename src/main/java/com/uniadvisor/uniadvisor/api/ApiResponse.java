package com.uniadvisor.uniadvisor.api;

public class ApiResponse {
    private final long id;
    private final Location location;

    public ApiResponse(long id, Location location) {
        this.id = id;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public Location getLocation() {
        return location;
    }
}
