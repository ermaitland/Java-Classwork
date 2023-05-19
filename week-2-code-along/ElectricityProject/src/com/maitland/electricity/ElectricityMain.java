package com.maitland.electricity;

import java.util.Scanner;

public class ElectricityMain {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("How many units of Electricity did you use? ");
	int electricityUsed=scanner.nextInt();
	Electricity electricity=new Electricity();
	electricity.setNumber(electricityUsed);
	System.out.println("The price will be, £"+electricity.getPrice());

	}

}
