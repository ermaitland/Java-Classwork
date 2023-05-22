package com.ellie.person;

public class MainPerson {

	public static void main(String[] args) {
		PersonClass person=new PersonClass(7182, "Eleanor");
		person.displayPerson();
		System.out.println("-------------------------");
		Employee employee=new Employee(8172, "Claire", 30000, "Msc", "Software");
		employee.displayEmployee();
		System.out.println("-------------------------");
		BuissnessMan buisness=new BuissnessMan(7182, "Susie", "Finance", 1000000);
		buisness.displayBuissnessMan();

	}

}
