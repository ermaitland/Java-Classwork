package com.ellie.firstDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.ellie")
public class RestServiceDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceDemo1Application.class, args);
	}

}
