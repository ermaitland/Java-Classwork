package org.animal;

public class Frog extends Animal {

	public Frog(String color, int weight, int age) {
		super(color, weight, age);
		setClimb(true);
		setVegetarian(true);
	}
	
	@Override public void sound() {
		System.out.println("Ribbbiittttttttttttt");
	}

}
