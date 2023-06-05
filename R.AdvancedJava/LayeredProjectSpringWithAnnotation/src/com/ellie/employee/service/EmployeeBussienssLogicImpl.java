package com.ellie.employee.service;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ellie.employee.dto.Employee;
import com.ellie.employee.exception.EmployeeIdNotFoundException;
import com.ellie.employee.persistance.EmployeeDataAccessImpl;
import com.ellie.employee.persistance.EmployeeDataAccess;

@Component("service")
public class EmployeeBussienssLogicImpl implements EmployeeBussinessLogic {

	private EmployeeDataAccess dataAccess;
	
	@Autowired
	public EmployeeBussienssLogicImpl(@Qualifier("dataAccess") EmployeeDataAccess dataAccess) {
		super();
		this.dataAccess = dataAccess;
	}

	private LinkedList<Employee> employeeList;
	{
		try {
			employeeList=EmployeeDataAccessImpl.readRecords();
			
		} catch (Exception e) {
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
	public void deleteEmployee(int id) throws EmployeeIdNotFoundException {
		boolean status=false;
		for(Employee employee:employeeList) {
			if(id==employee.getEmpId()) {
				status=employeeList.remove(employee);
			}
		}
		if(!status)
			throw new EmployeeIdNotFoundException("Employee not found");
	}
	
	@Override
	public void getSingleEmployee(int id) throws EmployeeIdNotFoundException {
		boolean status=false;
		for(Employee employee:employeeList) {
			if(id==employee.getEmpId()) {
				employee.displayEmployee();
				status=true;
			}
		}
		if(!status) 
			throw new EmployeeIdNotFoundException("Employee not found");
	}
	
	public void saveAllEmployees() {
		try {
			dataAccess.writeRecords(employeeList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
