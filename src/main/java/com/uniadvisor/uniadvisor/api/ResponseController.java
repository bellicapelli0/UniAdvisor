package com.uniadvisor.uniadvisor.api;

import java.util.concurrent.atomic.AtomicLong;

import com.uniadvisor.uniadvisor.db.DBContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {
    private final AtomicLong counter = new AtomicLong();
    private DBContext db;

    public ResponseController(DBContext db) {
        this.db = db;
    }

    @RequestMapping("/location")
    public ApiResponse location(@RequestParam(value="name", defaultValue="diag") String name) {
        //la stringa name contierrà lo shortname della location, la apiresponse ha un id univoco e una location
        return new ApiResponse(counter.incrementAndGet(), new Location());
    }
/*
    @RequestMapping("/coordinates")
    public apiresponse coordinates(@RequestParam(value="lat", defaultValue = "41.89") String lat,
                                   @RequestParam(value="lng", defaultValue = "12.503") String lng) {

    }

 */
}
