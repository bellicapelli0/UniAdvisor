package api;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.security.web.firewall.RequestRejectedException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class responseController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/location")
    public apiresponse location(@RequestParam(value="name", defaultValue="diag") String name) {
        //la stringa name contierrà lo shortname della location, la apiresponse ha un id univoco e una location
        return new apiresponse(counter.incrementAndGet(), new location());
    }
/*
    @RequestMapping("/coordinates")
    public apiresponse coordinates(@RequestParam(value="lat", defaultValue = "41.89") String lat,
                                   @RequestParam(value="lng", defaultValue = "12.503") String lng) {

    }

 */
}
