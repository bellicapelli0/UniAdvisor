package com.uniadvisor.uniadvisor;

import com.uniadvisor.uniadvisor.db.InitDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;

@SpringBootApplication
public class UniadvisorApplication {

    public static void main(String[] args) {
        if(args.length==0){
            printHelp();
            return;
        }

        switch (args[0]) {
            case "init":
                {
                    InitDB.main(new String[]{});
                    System.out.println("Database initialized.");
                    return;
                }
            case "prod": {
                SpringApplication.run(UniadvisorApplication.class, args);
                return;
            }
            default:
                printHelp();

        }
    }

    private static void printHelp(){
        System.out.println("Usage: java -jar uniadvisor-1.0.jar [par]");
        System.out.println("par values:");
        System.out.println("-\"init\": to initialize database.");
        System.out.println("-\"prod\": to run the program.");
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
