package com.ellie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ellie.entity.Employee;
import com.ellie.model.service.EmployeeService;

@RestController
public class EmployeeResource {
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping(path = "/employees/{empId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> searchEmployeeByIdResource(@PathVariable("empId") int id) {
		Employee employee=employeeService.searchEmployeeById(id);
		ResponseEntity response=null;
		if(employee!=null)
			response=new ResponseEntity<Employee>(employee, HttpStatus.OK);
		else
			response=new ResponseEntity<Employee>(employee,HttpStatus.NOT_FOUND);
		return response;
	}
}