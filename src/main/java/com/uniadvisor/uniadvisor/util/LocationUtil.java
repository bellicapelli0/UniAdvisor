package com.uniadvisor.uniadvisor.util;

import com.uniadvisor.uniadvisor.api.Location;
import com.uniadvisor.uniadvisor.db.Database;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LocationUtil {

    public static Location closest(double lat, double lng){
        Map<String, Location> locations = Database.getLocations();

        Location resultLocation = new Location();
        double distance = Double.MAX_VALUE;

        for (Map.Entry<String, Location> entry : locations.entrySet()){
            Location l = entry.getValue();
            if( l.getDist(lat, lng) < distance ){
                resultLocation = l;
                distance = l.getDist(lat, lng);
            }
        }
        return resultLocation;
    }



    public static Location[] threeClosest(double lat, double lng){
        Map<String, Location> pupupu = Database.getLocations();
        Map<String, Location> locations = new HashMap<>(pupupu);

        Location[] arr = new Location[3];

        double dist = Double.MAX_VALUE;
        Location loc = null;
        for(int i = 0; i<=2; i++) {
            for (Map.Entry<String, Location> entry : locations.entrySet()) {
                loc = entry.getValue();
                if (loc.getDist(lat, lng) < dist) {
                    dist = loc.getDist(lat, lng);
                    arr[i] = loc;
                }
            }
            dist = Double.MAX_VALUE;
            locations.remove(arr[i].getShortName());
        }
        return arr ;
    }

    public static void main(String[] args) {
        Map<String, Location> locations = Database.getLocations();
        System.out.println("diag");
        System.out.println();
        System.out.println();
        Location l = locations.get("diag");
        System.out.println(l);

//        System.out.println(Database.getLocations().size());
//        System.out.println(Arrays.toString(threeClosest(41.891026, 12.503710)));
//        System.out.println();
//        System.out.println();
//        System.out.println(Database.getLocations().get("diag").getDist(new Location()));
//
//        System.out.println(Database.getLocations().get("exposte").getDist(41.891026, 12.503710));
//        System.out.println(Database.getLocations().get("lab").getDist(41.891026, 12.503710));
//        System.out.println(Database.getLocations().get("pratone").getDist(41.891026, 12.503710));
//        System.out.println(Database.getLocations().get("mirafiori").getDist(41.891026, 12.503710));
//        System.out.println(Database.getLocations().get("spv").getDist(41.891026, 12.503710));
//        System.out.println(Database.getLocations().get("geologia").getDist(41.891026, 12.503710));
//        System.out.println(Database.getLocations().get("maxxi").getDist(41.891026, 12.503710));
//        System.out.println(Database.getLocations().get("roma3").getDist(41.891026, 12.503710));
//        System.out.println(Database.getLocations().get("bellearti").getDist(41.891026, 12.503710));
//        System.out.println();
//        System.out.println(closest(41.891026, 12.503710));

    }
}
