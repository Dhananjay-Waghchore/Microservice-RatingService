package com.microservices.ratingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesRatingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesRatingServiceApplication.class, args);
	}

}
