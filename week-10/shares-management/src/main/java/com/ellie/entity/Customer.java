package com.ellie.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Customer {
	private int detailsId;
	private int customerId;
	private String shareId;
	private String shareType;
	private int quantity;
	
}
