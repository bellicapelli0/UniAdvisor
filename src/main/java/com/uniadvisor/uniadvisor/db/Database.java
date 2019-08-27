package com.uniadvisor.uniadvisor.db;

import com.uniadvisor.uniadvisor.api.Location;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

@Component
public class Database {
    private static DBContext db = MapDBContext.onlineInstance("file.db");



    public static Map<String, Location> getLocations(){
        return db.getMap("LOCATIONS");
    }

    public static Set<String> getUsers() {
        return db.getSet("TEST");
    }

    public static void commit() {
        db.commit();
    }
}
