package com.ellie.dto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	private String designation;
	private int salary;
	@ManyToOne
	private Project project;
	
	
}
