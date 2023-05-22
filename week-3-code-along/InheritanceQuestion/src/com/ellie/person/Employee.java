package com.ellie.person;

public class Employee extends PersonClass {	
	private String designation, department;
	private int salary;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void inputEmployeeData(int salary,String personName,String designation,String department, int personId) {
		inputPerson(personName, personId);
		this.salary=salary;
		this.designation=designation;
		this.department=department;
	}
	
	public void displayEmployee() {
		displayPerson();
		System.out.println("Designation : "+designation);
		System.out.println("Department : "+department);
		System.out.println("Salary : "+salary);
	}
	
}
