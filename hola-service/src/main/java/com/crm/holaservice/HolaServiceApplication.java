package com.crm.holaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HolaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaServiceApplication.class, args);
	}

}
