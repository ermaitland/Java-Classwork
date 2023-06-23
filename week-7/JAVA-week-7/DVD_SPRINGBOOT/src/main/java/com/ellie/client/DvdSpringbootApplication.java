package com.ellie.client;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ellie.dvd.presentation.DVDUserInterface;

@SpringBootApplication(scanBasePackages = "com.ellie")
public class DvdSpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer=SpringApplication.run(DvdSpringbootApplication.class, args);
		DVDUserInterface dvdUserInterface=(DVDUserInterface)springContainer.getBean("dvdPresentation");
		Scanner scanner=new Scanner(System.in);
		while(true) {
			dvdUserInterface.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			dvdUserInterface.performMenu(choice);
	}
	}
	}
