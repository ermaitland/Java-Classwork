package com.maitland.dynamic;

public class Audi extends Car {

	public Audi(String model, String color) {
		super(model, color);
		// TODO Auto-generated constructor stub
	}
	
@Override public void engine() {
	System.out.println("Audi engine goes Vrrrrooooommmmmmm.....");
}
}
