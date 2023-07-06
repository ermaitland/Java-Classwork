package com.ellie.entitiy;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Person {
	@Id
	private int personID;
	private String personName;
	private int personAge;
	@OneToMany
	private List vehicleList=(List) new ArrayList<Vehicle>();
	public Person(int personID, String personName, int personAge) {
		super();
		this.personID = personID;
		this.personName = personName;
		this.personAge = personAge;
	} 




}
