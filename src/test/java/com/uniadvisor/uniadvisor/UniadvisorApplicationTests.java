package com.uniadvisor.uniadvisor;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.results.ResultMatchers;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@WebMvcTest
public class UniadvisorApplicationTests {

//    @Autowired
//    private MockMvc mvc;

    // write test cases here

    @Test
    public void contextLoads() {
//        this.mvc = standaloneSetup().build();

    }

//    @Test
//    public void testEndpoint() throws Exception {
//        System.out.println(mvc);
//        mvc.perform(get("/api/location"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
////                .andExpect()
////              .contentType(MediaType.APPLICATION_JSON).andExpect(status().isOk())
////                .andExpect(MockMvcResultMatchers.jsonPath("$").value(1))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[0].location.shortName").value("diag"));
//
//    }


}
