package org.animal;

public class Elephant extends Animal {

	public Elephant(String color, int weight, int age) {
		super(color, weight, age);
		setClimb(false);
		setVegetarian(true);
	}
	
	@Override public void sound() {
		System.out.println("Brrrruuuuuuuuuuuuuuuuuuuuuuu");
	}

}
