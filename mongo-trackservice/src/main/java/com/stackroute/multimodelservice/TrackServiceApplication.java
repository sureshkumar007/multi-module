package com.stackroute.multimodelservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Enables Spring Boot auto config and component scanning.
 */
/**Enable swagger support in the class*/
@EnableEurekaClient
@EnableSwagger2
//@PropertySource("application-mongo.properties")
@SpringBootApplication
public class TrackServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(TrackServiceApplication.class, args);
    }

}
