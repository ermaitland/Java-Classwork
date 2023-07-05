package com.ellie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name="STUDENT")
public class Student {
	
	@Id
	private int RollNo;
	private String name;
	private int age;
	private String classOfStudent;
	private String address;
	private String phoneNumber;
}
