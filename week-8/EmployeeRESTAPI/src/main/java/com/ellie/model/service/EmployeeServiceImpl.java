package com.ellie.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ellie.entity.Employee;
import com.ellie.model.persistance.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Employee searchEmployeeById(int id) {
		return employeeDao.getRecordById(id);
	}

}