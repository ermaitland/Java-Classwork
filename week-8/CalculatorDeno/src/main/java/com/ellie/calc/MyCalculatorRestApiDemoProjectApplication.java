package com.ellie.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ellie")
public class MyCalculatorRestApiDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCalculatorRestApiDemoProjectApplication.class, args);
	}

}