package com.uniadvisor.uniadvisor;

import com.uniadvisor.uniadvisor.util.AuthorizedClientServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    private OAuth2AuthorizedClientService authorizedClientService;

    @GetMapping("/")
    public String index(Model model, OAuth2AuthenticationToken authentication){
        if(authentication==null) return "cerca2";
        Map userAttributes = AuthorizedClientServiceUtil.getAttributes(authorizedClientService, authentication);
        model.addAttribute("name", userAttributes.get("name"));
        return "cerca2";
    }
}
