package com.ellie.dto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
public class Husband {
	
	@Id
	private int husbandId;
	private String husbandName;
	
}
