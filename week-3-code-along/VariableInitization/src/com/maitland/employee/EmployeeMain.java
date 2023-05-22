package com.maitland.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee("Ellie", 28);
		Employee employee1=new Employee("Ellie", "MSc", "London", 5, 32432, 28);
		employee.showEmployee();
		System.out.println("---------------");
		employee1.showEmployee();
	}

}
