package com.maitland.calculator;

import java.util.Scanner;

public class CalculatorMain extends Calculator {
 public CalculatorMain(double number1, double number2) {
		super(number1, number2);
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter the first Number : ");
	 double number1=scanner.nextDouble();
	 System.out.println("Enter the second Number :");
	 double number2=scanner.nextDouble();
	 Calculator equation=new Calculator(number1, number2);
	 
	 System.out.println("Enter the action, 1=+, 2=-, 3=*, 4=/ and any other value to exit :");
	 int action=scanner.nextInt();
	 switch(action) {
		 case 1:
			 equation.add(number1, number2);
			 break;
		 case 2:
			 equation.minus(number1, number2);
			 break;
		 case 3:
			 equation.mul(number1, number2);
			 break;
		 case 4:
			 equation.div(number1, number2);
			 break;
		 default:
			 System.out.println("Invalid Input");
			 break;
	 }
	 
	 
 }
}
