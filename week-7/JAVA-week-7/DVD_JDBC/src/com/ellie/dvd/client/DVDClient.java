package com.ellie.dvd.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ellie.dvd.presentation.DVDUserInterface;

public class DVDClient {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(DVDConfig.class);
		DVDUserInterface dvdUserInterface=(DVDUserInterface)springContainer.getBean("userInterface");
		Scanner scanner=new Scanner(System.in);
		while(true) {
			dvdUserInterface.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			dvdUserInterface.performMenu(choice);
			
		}
	}
}
