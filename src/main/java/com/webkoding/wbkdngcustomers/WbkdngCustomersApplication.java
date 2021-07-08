package com.webkoding.wbkdngcustomers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WbkdngCustomersApplication {

	public static void main(String[] args) {
		SpringApplication.run(WbkdngCustomersApplication.class, args);
	}

}
