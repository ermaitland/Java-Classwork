package com.ellie.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ellie")
public class EmployeeRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestapiApplication.class, args);
	}

}
