package com.elle.generics;

public class MainGeneric {

	public static void main(String[] args) {
		GenericInput<String> obj1=new GenericInput<String>();
		obj1.setValue("Ellie");
		System.out.println(obj1.getValue());
		
		GenericInput<Double> obj2=new GenericInput<Double>();
		obj2.setValue(2.3);
		System.out.println(obj2.getValue());
		
		GenericInput<Person> obj3=new GenericInput<Person>();
		obj3.setValue(new Person(101, "Ellie"));
		// Whenever we try to print object with System.out.print
		// implicit call goes to toString() method of object class. Prints hashcode
		// so need to do right click, source and generate toString() in the Person class
		System.out.println(obj3.getValue());
	}

}
