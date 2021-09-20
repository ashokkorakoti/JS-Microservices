package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JsProfiles1Application {

	public static void main(String[] args) {
		SpringApplication.run(JsProfiles1Application.class, args);
	}

}
