package com.maitland.method;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		int number1=0;
		int number2 = 0;
		double doubleNumber1=0.0;
		double doubleNumber2=0.0;
		Calculator calculator=new Calculator();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the first number, and first decimal : ");
		if(scanner.hasNextInt()) {
		number1=scanner.nextInt();
		}
		if(scanner.hasNextDouble()) {
		doubleNumber1=scanner.nextDouble();
		}
		System.out.println("Please enter the second number, and second decimal :");
		if(scanner.hasNextInt()) {
		number2=scanner.nextInt();
		}
		if(scanner.hasNextDouble()) {
		doubleNumber2=scanner.nextDouble();
		}
		System.out.println("Please add 1 to plus, 2 to minus, 3 to multiply and 4 to divide : ");
		int action=scanner.nextInt();
		calculator.action(action, number1, number2, doubleNumber1, doubleNumber2);
	
	}

}
