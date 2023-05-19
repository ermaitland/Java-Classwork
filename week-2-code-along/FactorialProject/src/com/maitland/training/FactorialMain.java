package com.maitland.training;

import java.util.Scanner;
import com.maitland.demo.Factorial;

public class FactorialMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Factorial factorial=new Factorial();
		System.out.println("Enter Number : ");
		int number=scanner.nextInt();
		factorial.setNumber(number);
		System.out.println("factorial = "+factorial.getFactorial());
	}

}
