package com.uniadvisor.uniadvisor.api;

import com.uniadvisor.uniadvisor.util.AuthorizedClientServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class TemplateController {

    @Autowired
    private OAuth2AuthorizedClientService authorizedClientService;


    @GetMapping("/{location}")
    public String locations(@PathVariable("location") String location, Model model, OAuth2AuthenticationToken authentication){
        Map userAttributes = AuthorizedClientServiceUtil.getAttributes(authorizedClientService, authentication);
        model.addAttribute("name", userAttributes.get("name"));
        return location;
    }


}
