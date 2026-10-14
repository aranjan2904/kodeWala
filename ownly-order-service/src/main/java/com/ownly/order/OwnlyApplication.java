package com.ownly.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OwnlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwnlyApplication.class, args);
	}

}
