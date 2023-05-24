package com.maitland.dynamic;

public class CarRental {

	public static void main(String[] args) {
		Audi audi = new Audi("A8", "Red");
		BMW bmw=new BMW("Q7", "Blue");
		Hyundai hyundai=new Hyundai("Verna", "White");
		
		
		Driver ellie=new Driver("Ellie");
		Driver shifahu=new Driver("Shifahu");
		Driver lily=new Driver("Lily");
		
		lily.setCar(bmw);
		lily.drive();
		ellie.setCar(hyundai);
		ellie.drive();
		shifahu.setCar(audi);
		shifahu.drive();
	}

}
