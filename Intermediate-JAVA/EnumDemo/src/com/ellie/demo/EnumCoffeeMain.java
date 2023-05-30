package com.ellie.demo;

public class EnumCoffeeMain {

	public static void main(String[] args) {
		Coffee coffee;
		coffee =Coffee.OVERWHELMING;
		
		System.out.println("Customer ordered "+coffee+" sized coffee, which serve "+coffee.getSize()+ " oz of coffee! It costs £"+coffee.getPrice()+"!");

	}

}
