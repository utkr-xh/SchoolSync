package com.tka.sams.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SamsTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamsTrackApplication.class, args);
		
		System.out.println("application is started");
	}

}
