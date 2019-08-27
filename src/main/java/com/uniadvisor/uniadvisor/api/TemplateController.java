package com.uniadvisor.uniadvisor.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TemplateController {


    @GetMapping("{location}")
    public String locations(@PathVariable("location") String location){
        return location;
    }


}
