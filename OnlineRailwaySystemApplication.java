package com.toy.Online_Railway_System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class OnlineRailwaySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineRailwaySystemApplication.class, args);
	}

}
