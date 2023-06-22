package com.ellie.employee.service;

import java.util.List;

import com.ellie.employee.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	
	boolean addEmployee(Employee employee);
	
	boolean deleteEmployeeById(int id);
	
	boolean incrementEmployeeSalary(int id,int increment);
}