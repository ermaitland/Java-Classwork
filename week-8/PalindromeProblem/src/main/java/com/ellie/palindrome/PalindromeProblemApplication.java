package com.ellie.palindrome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ellie")
public class PalindromeProblemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalindromeProblemApplication.class, args);
	}

}
