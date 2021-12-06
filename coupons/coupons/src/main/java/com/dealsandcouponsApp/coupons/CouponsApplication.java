package com.dealsandcouponsApp.coupons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CouponsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouponsApplication.class, args);
	}

}
