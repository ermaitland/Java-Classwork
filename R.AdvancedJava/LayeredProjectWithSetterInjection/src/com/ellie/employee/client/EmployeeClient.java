package com.ellie.employee.client;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.ellie.employee.ui.EmployeeUserInteracelmpl;
import com.ellie.employee.ui.EmployeeUserInterface;

public class EmployeeClient {

	public static void main(String[] args) {
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("Employee.xml");
		
//		EmployeeUserInterface employeeUserInterface=new EmployeeUserInteracelmpl();
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
