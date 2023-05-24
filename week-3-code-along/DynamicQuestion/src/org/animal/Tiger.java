package org.animal;

public class Tiger extends Animal {

	public Tiger(String color, int weight, int age) {
		super(color, weight, age);
		setClimb(false);
		setVegetarian(false);
	}
	
	@Override public void sound() {
		System.out.println("Rawwwrrrr");
	}


}
