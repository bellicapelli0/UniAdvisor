package com.uniadvisor.uniadvisor.api;

import com.uniadvisor.uniadvisor.db.DBContext;
import com.uniadvisor.uniadvisor.db.Database;
import com.uniadvisor.uniadvisor.db.MapDBContext;
import org.mapdb.DB;

import java.util.Map;

public class InitDB {



    public static void main(String[] args) {


//        Map<String, Location> locations = Database.getLocations();
//        locations.put("diag", new Location());
//        System.out.println(Database.getLocations().get("diag").toString());
        Database.getUsers().add("caca");
        Database.commit();
        System.out.println(Database.getUsers());

    }
}
