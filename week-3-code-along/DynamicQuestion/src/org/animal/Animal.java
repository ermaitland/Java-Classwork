package org.animal;

abstract public class Animal {
 private String color;
 private int weight, age;
 private boolean vegetarian, climb;
 
public Animal(String color, int weight, int age) {
	super();
	this.color = color;
	this.weight = weight;
	this.age = age;

}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isVegetarian() {
	return vegetarian;
}
public void setVegetarian(boolean vegetarian) {
	this.vegetarian = vegetarian;
}
public boolean isClimb() {
	return climb;
}
public void setClimb(boolean climb) {
	this.climb = climb;
}
 
 abstract public void sound() ;
}
