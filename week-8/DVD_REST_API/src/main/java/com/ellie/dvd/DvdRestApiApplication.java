package com.ellie.dvd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ellie")
public class DvdRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DvdRestApiApplication.class, args);
	}

}
