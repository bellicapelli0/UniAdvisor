package com.uniadvisor.uniadvisor.util;

import com.uniadvisor.uniadvisor.api.Location;
import com.uniadvisor.uniadvisor.db.Database;

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
        Map<String, Location> locations = Database.getLocations();
        Location[] arr = new Location[locations.size()];
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
        }




        return null ;//Arrays.copyOfRange(arr,0, 2);
    }
}
