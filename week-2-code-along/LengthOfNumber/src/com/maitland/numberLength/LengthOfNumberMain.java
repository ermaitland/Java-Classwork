package com.maitland.numberLength;

import java.util.Scanner;

public class LengthOfNumberMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number you want to know the length of :");
		int number=scanner.nextInt();
		LengthOfNumber lengthOfNumber=new LengthOfNumber();
		lengthOfNumber.setNumber(number);
		System.out.println("The length of "+number+" is : "+lengthOfNumber.getLength());

	}

}
