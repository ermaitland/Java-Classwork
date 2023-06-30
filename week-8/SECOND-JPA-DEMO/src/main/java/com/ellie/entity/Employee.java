package com.ellie.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name="EMPL")
public class Employee {
	@Id
	@Column(name="id")
	private int empId;
	@Column(name="name", length = 30)
	private String empName;
	private String designation;
	private String department;
	@Column(name="basicSalary")
	private double salary;
}
