package com.ellie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ellie")
public class SpringWebMvnDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebMvnDemoApplication.class, args);
	}

}
