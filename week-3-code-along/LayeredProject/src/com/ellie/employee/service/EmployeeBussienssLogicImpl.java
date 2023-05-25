package com.ellie.employee.service;

import java.util.LinkedList;

import com.ellie.employee.dto.Employee;
import com.ellie.employee.persistance.EmployeeDataAccessImpl;
import com.ellie.employee.persistance.EmployeeDataAccess;

public class EmployeeBussienssLogicImpl implements EmployeeBussinessLogic {

	private EmployeeDataAccess dataAccess=new EmployeeDataAccessImpl();
	
	private LinkedList<Employee> employeeList;
	
	public EmployeeBussienssLogicImpl() {
		try {
		employeeList=dataAccess.readRecords();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public LinkedList<Employee> getAllEmployees() {

		return employeeList;
	}

	@Override
	public boolean addEmployee(Employee employee) {

		return employeeList.add(employee);
	}

	@Override
	public boolean deleteEmployee(int id) {
		for(Employee employee:employeeList) {
			if(id==employee.getEmpId())
				return employeeList.remove(employee);
		}
		return false;
	}
	
	@Override
	public Employee getSingleEmployee(int id) {
		for(Employee employee:employeeList) {
			if(id==employee.getEmpId()) {
				return employee;
			}
		}
		return null;
	}
	
	public void saveAllEmployees() {
		try {
			dataAccess.writeRecords(employeeList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
