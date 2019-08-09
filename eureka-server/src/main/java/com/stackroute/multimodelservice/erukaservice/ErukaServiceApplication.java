package com.stackroute.multimodelservice.erukaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ErukaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErukaServiceApplication.class, args);
	}

}
