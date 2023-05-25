package com.ellie.entity;

import java.util.ArrayList;
import java.util.List;

public class EmployArrayList {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>(); //could also do ArrayList = new ArrayList
		
		empList.add(new Employee(101, "Ellie", 6789.5));
		empList.add(new Employee(102, "Brita", 6790.5));
		empList.add(new Employee(103, "Cam", 3789.5));
		empList.add(new Employee(104, "Debbie", 6123.0 ));
		
		for(Employee employee:empList) {
			System.out.println(employee); // Must remember to so toString method in the class with the object
		}
		

	}

}
