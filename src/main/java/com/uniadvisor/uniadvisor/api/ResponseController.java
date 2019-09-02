package com.uniadvisor.uniadvisor.api;

import com.uniadvisor.uniadvisor.db.Database;
import com.uniadvisor.uniadvisor.util.LocationUtil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ResponseController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/api/location") //richiesta per il nome della location
    public ApiResponse location(@RequestParam(value="name", defaultValue="diag") String name) {
        Map<String, Location> locations = Database.getLocations();

        return new ApiResponse(counter.incrementAndGet(), locations.get(name));
    }

    @RequestMapping("/api/coordinates") //richiesta per la location più vicina
    public ApiResponse coordinates(@RequestParam(value="lat", defaultValue = "41.890") String la,
                                   @RequestParam(value="lng", defaultValue = "12.503") String lo) {
        double lat = Double.parseDouble(la);
        double lng = Double.parseDouble(lo);

        return new ApiResponse(counter.incrementAndGet(), LocationUtil.closest(lat,lng));
    }

    @RequestMapping("/api/threeclosest") //richiesta per la location più vicina
    public Location[] threeClosest(@RequestParam(value="lat", defaultValue = "41.89") String la,
                                   @RequestParam(value="lng", defaultValue = "12.503") String lo) {
        double lat = Double.parseDouble(la);
        double lng = Double.parseDouble(lo);

        return LocationUtil.threeClosest(lat,lng);
    }


    //Se vai su localhost:8080/example, vedi il risultato
    @GetMapping("/example")
    public Set example(){
        //ritorna un set di stringhe
        Set<String> users = Database.getUsers();
        return users;
    }

    @GetMapping("/example/add")
    public String addString(@RequestParam("par1") String par1){
        Database.getUsers().add(par1);
        Database.commit();
        return "Success! "+par1+" added to set!\nGo localhost:8080/example to see result";
    }

    @GetMapping("/api/rating")
    public String rating(@RequestParam(value = "vote", required = false) String vote, @RequestParam(value = "location") String location){
        if(!Database.getLocations().keySet().contains(location)){
            return " ";
        }
        System.out.println(vote);
        return vote;
    }


}
