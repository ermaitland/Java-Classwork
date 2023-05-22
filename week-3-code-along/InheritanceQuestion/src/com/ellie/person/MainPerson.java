package com.ellie.person;

public class MainPerson {

	public static void main(String[] args) {
		PersonClass person=new PersonClass();
		person.inputPerson("Ellie",14235);
		person.displayPerson();
		System.out.println("-------------------------");
		Employee employee=new Employee();
		employee.inputEmployeeData(30000, "Claire", "MSc", "Software", 34253);
		employee.displayEmployee();
		System.out.println("-------------------------");
		BuissnessMan buisness=new BuissnessMan();
		buisness.inputBuisnesseData(10000000, "Susie", "Finance", 47194);
		buisness.displayBuissnessMan();

	}

}
