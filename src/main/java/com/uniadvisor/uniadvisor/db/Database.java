package com.uniadvisor.uniadvisor.db;

import com.uniadvisor.uniadvisor.api.Location;
import com.uniadvisor.uniadvisor.util.Pair;
import org.springframework.stereotype.Component;

import java.util.List;
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

    public static Map<String, Pair<Integer, Integer>> getVotes(){
        return db.getMap("VOTES");
    }

    public static void commit() {
        db.commit();
    }

    public static Map<String, double[]> test(){
        return db.getMap("TESTARRAY");
    }

    /**
     * returns a map with k = location name and v = "#votes,#arra
     * @return
     */
    public static Map<String, List<Integer>> stars(){
        return db.getMap("STAR_RATINGS");
    }
}
