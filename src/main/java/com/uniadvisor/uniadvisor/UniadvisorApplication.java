package com.uniadvisor.uniadvisor;

import com.uniadvisor.uniadvisor.db.DBContext;
import com.uniadvisor.uniadvisor.db.MapDBContext;
import org.mapdb.DB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;

@SpringBootApplication
public class UniadvisorApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniadvisorApplication.class, args);
    }

//    @Bean
//    public DBContext mapDB(){
//        return MapDBContext.onlineInstance("file.db");
//    }

    @Bean
    public SpringSecurityDialect springSecurityDialect() {
        return new SpringSecurityDialect();
    }
}
