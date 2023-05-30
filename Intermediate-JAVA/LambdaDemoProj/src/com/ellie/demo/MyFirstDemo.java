package com.ellie.demo;

@FunctionalInterface
interface Greet{
	public void wish(String name);
}
public class MyFirstDemo {

	public static void main(String[] args) {
		Greet greet=name-> System.out.println("Welcome "+name);
		greet.wish("Ellie");
	}

}
