package com.maitland.armstrong;

import java.util.Scanner;

public class ArmstrongMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number you want to test for Armstrong number : ");
		int number=scanner.nextInt();
		ArmstrongNumber armstrongNumber=new ArmstrongNumber();
		armstrongNumber.setNumber(number);
		System.out.println("The number is an Armstrong number... : "+armstrongNumber.isArmstrong());
	}

}
