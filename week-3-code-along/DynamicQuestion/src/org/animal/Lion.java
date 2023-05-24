package org.animal;

public class Lion extends Animal {

	public Lion(String color, int weight, int age) {
		super(color, weight, age);
		setClimb(false);
		setVegetarian(false);
	}
	
	@Override public void sound() {
		System.out.println("Rawwwrrrr");
	}

}
