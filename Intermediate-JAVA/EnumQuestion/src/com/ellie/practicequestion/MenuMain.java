package com.ellie.practicequestion;

public class MenuMain {
	public static void main(String[] args) {	
	Menu dish=Menu.LENTILS;
	Menu dish2=Menu.PIZZA;
	
	System.out.println("I chose "+dish+" and it has "+dish.getCalorie()+" calories and costs £"+dish.getPrice());
	System.out.println("I chose "+dish2+" and it has "+dish2.getCalorie()+" calories and costs £"+dish2.getPrice());
	}
}
