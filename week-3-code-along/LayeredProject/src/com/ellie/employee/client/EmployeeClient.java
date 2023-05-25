package com.ellie.employee.client;

import java.util.Scanner;

import com.ellie.employee.ui.EmployeeUserInteracelmpl;
import com.ellie.employee.ui.EmployeeUserInterface;

public class EmployeeClient {

	public static void main(String[] args) {
		EmployeeUserInterface employeeUserInterface=new EmployeeUserInteracelmpl();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeeUserInterface.showMenu();
			System.out.println("Enter Choice :");
			int choice=scanner.nextInt();
			employeeUserInterface.performMenu(choice);
		}
	}

}
