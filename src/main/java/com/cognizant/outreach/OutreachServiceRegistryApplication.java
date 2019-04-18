package com.cognizant.outreach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OutreachServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OutreachServiceRegistryApplication.class, args);
	}

}
