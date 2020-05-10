package com.cg.iter.greatoutdoorscms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GreatOutDoorsCancelManagementSysyemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreatOutDoorsCancelManagementSysyemApplication.class, args);
	}

}
