package com.ellie.employee.persistence;

import java.util.List;

import com.ellie.employee.entity.Employee;

public interface EmployeeDao {

	List<Employee> getAllRecords();
	int addRecord(Employee employee);
	int deleteRecord(int id);
	int updateRecord(int id,int increment);
}