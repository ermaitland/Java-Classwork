package com.ellie.student;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ellie.presentation.StudentPresentation;

@SpringBootApplication(scanBasePackages = "com.ellie")
@EntityScan(basePackages = "com.ellie.entity")
@EnableJpaRepositories(basePackages = "com.ellie.persistence")
public class StudentJpaPracticeQApplication implements CommandLineRunner  {
	
	@Autowired
	private StudentPresentation studentPresentation;
	
	
	public static void main(String[] args) {
		SpringApplication.run(StudentJpaPracticeQApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			studentPresentation.showMenu();
			System.out.println("Enter choice : ");
			int choice=scanner.nextInt();
			studentPresentation.performMenu(choice);
		}
		
	}

}
