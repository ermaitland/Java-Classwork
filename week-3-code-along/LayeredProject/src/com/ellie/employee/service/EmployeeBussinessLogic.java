package com.ellie.employee.service;

import java.util.LinkedList;

import com.ellie.employee.dto.Employee;

public interface EmployeeBussinessLogic {

	LinkedList<Employee> getAllEmployees();
	boolean addEmployee(Employee employee);
	boolean deleteEmployee(int id);
	public void saveAllEmployees();
	public void getSingleEmployee(int id);
	
}
