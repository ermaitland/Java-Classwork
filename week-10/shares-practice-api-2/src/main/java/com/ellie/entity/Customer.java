package com.ellie.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Customer {
	@Id
	private int detailsId;
	private int customerId;
	private String shareId;
	private String shareType;
	private int quantity;
	
}
