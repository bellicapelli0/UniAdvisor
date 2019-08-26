package com.uniadvisor.uniadvisor.db;

import com.uniadvisor.uniadvisor.api.Location;
import org.mapdb.DB;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class Database  {
    private static DBContext db;
    public Database(DBContext db) {
        Database.db = db;
    }

    public static void commit(){
        db.commit();
    }

    //Example of string set
    public static Set<String> getUsers(){
        return db.getSet("USERS");
    }

    //Example of map of string, location
    public static Map<String, Location> getLocations(){
        return db.getMap("LOCATIONS");
    }

    //Example of list of strings
    public static List<String> getListString(){
        return db.getList("STRINGS");
    }
}
