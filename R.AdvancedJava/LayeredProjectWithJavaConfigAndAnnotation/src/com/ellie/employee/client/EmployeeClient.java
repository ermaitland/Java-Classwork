package com.ellie.employee.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ellie.employee.ui.EmployeeUserInterface;

public class EmployeeClient {

	public static void main(String[] args) {

AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(EmployeeConfig.class);
EmployeeUserInterface employeeUserInterface=(EmployeeUserInterface)springContainer.getBean("userInterface");
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeeUserInterface.showMenu();
			System.out.println("Enter Choice :");
			int choice=scanner.nextInt();
			employeeUserInterface.performMenu(choice);
		}
	}

}
