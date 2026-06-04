package com.viratbank.serviceregistery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceregisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceregisteryApplication.class, args);
	}

}
