package com.ellie.employee.service;

import java.util.LinkedList;

import com.ellie.employee.dto.Employee;
import com.ellie.employee.exception.EmployeeIdNotFoundException;

public interface EmployeeBussinessLogic {

	LinkedList<Employee> getAllEmployees();
	boolean addEmployee(Employee employee);
	void deleteEmployee(int id) throws EmployeeIdNotFoundException;
	public void saveAllEmployees();
	public void getSingleEmployee(int id) throws EmployeeIdNotFoundException;
	
}
