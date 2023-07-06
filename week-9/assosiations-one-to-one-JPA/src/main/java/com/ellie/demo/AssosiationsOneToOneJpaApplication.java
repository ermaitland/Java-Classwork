package com.ellie.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ellie.presentation.HusbandWifePresentation;

@SpringBootApplication(scanBasePackages = "com.ellie")
@EntityScan(basePackages = "com.ellie.dto.entity")
@EnableJpaRepositories(basePackages = "com.ellie.persistence")
public class AssosiationsOneToOneJpaApplication implements CommandLineRunner {

	@Autowired
	HusbandWifePresentation hWPresentation;
	
	public static void main(String[] args) {
		SpringApplication.run(AssosiationsOneToOneJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			hWPresentation.showMenu();
			System.out.println("Enter Choice");
			int choice = scanner.nextInt();
			hWPresentation.performMenu(choice);
		}
		
	}
	 

	
}
