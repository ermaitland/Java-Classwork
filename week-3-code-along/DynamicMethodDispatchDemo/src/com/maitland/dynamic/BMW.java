package com.maitland.dynamic;

public class BMW extends Car {

	public BMW(String model, String color) {
		super(model, color);
	}
	
	@Override public void engine() {
		System.out.println("BMW engine goes BOOMMM....");
	}

}
