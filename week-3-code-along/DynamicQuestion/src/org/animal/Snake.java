package org.animal;

public class Snake extends Animal {

	public Snake(String color, int weight, int age) {
		super(color, weight, age);
		setClimb(false);
		setVegetarian(false);
	}
	
	@Override public void sound() {
		System.out.println("Sssssssssssssssssssss");
	}

}
