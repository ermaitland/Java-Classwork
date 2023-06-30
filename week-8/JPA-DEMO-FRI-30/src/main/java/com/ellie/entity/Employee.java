package com.ellie.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Employee {
	@Id
	private int empId;
	private String empName;
	private String designation;
	private String department;
	private double salary;
}
