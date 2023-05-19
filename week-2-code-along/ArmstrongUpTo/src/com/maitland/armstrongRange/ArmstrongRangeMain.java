package com.maitland.armstrongRange;

import java.util.Scanner;

public class ArmstrongRangeMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value you want to check armstrong number up too : ");
		int number=scanner.nextInt();
		ArmstrongRange armstrongRange=new ArmstrongRange();
		armstrongRange.setNumber(number);
		System.out.println("The armstrong numbers are : "+armstrongRange.getArmstrongNumbers());

	}

}
