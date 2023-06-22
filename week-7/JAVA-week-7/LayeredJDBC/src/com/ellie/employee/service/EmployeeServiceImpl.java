package com.ellie.employee.service;

import java.util.List;

import com.ellie.employee.entity.Employee;
import com.ellie.employee.persistence.EmployeeDao;
import com.ellie.employee.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllRecords();
	}

	@Override
	public boolean addEmployee(Employee employee) {
		return employeeDao.addRecord(employee)>0;
	}

	@Override
	public boolean deleteEmployeeById(int id) {
		return employeeDao.deleteRecord(id)>0;
	}

	@Override
	public boolean incrementEmployeeSalary(int id, int increment) {
		return employeeDao.updateRecord(id, increment)>0;
	}

}