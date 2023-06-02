package com.ellie.employee.persistance;

import java.util.LinkedList;

import com.ellie.employee.dto.Employee;

public interface EmployeeDataAccess {

	public boolean writeRecords(LinkedList<Employee> employees) throws Exception;
	
}
