package com.ellie.shares.entity;

import javax.persistence.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CustomerService {
	
	private int customerId;
	private String shareName;
	private int quanitiy;
	private double sharePrice;
	private double total;
	private String shareType;
}
