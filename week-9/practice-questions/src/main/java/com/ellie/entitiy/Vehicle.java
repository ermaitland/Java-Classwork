package com.ellie.entitiy;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Vehicle {
	@Id
	private int vehicleID;
	private String model;
	private int carAge;
}
