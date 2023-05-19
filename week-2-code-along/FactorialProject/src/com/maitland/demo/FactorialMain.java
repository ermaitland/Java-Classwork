package com.maitland.demo;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Factorial factorial=new Factorial();
		System.out.println("Enter Number : ");
		int number=scanner.nextInt();
		factorial.setNumber(number);
		System.out.println("The factorial of"+number+" is : "+factorial.getFactorial());

	}

}
