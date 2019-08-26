package com.uniadvisor.uniadvisor.api;

import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import com.uniadvisor.uniadvisor.db.DBContext;
import com.uniadvisor.uniadvisor.db.Database;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;

@RestController
public class ResponseController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/location")
    public ApiResponse location(@RequestParam(value="name", defaultValue="diag") String name) {
        //la stringa name contierrà lo shortname della location, la apiresponse ha un id univoco e una location
        return new ApiResponse(counter.incrementAndGet(), new Location());
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
/*
    @RequestMapping("/coordinates")
    public apiresponse coordinates(@RequestParam(value="lat", defaultValue = "41.89") String lat,
                                   @RequestParam(value="lng", defaultValue = "12.503") String lng) {

    }

 */
}
