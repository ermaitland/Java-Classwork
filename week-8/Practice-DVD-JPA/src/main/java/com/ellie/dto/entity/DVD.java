package com.ellie.dto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DVD-LIB")
public class DVD {

	@Id
	@Column(name = "id")
	private int empId;
	private String empName;
	private String designation;
	private String department;
	private double salary;
}