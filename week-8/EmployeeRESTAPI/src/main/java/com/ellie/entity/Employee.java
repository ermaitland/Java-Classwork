package com.ellie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Employee {

	private int empId;
	private String empName;
	private String empDesignation;
	private String empDepartment;
	private int age;
	private String dateOfJoining;
	
}
