package com.ellie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetails {
	 private int customerId;
	 private String shareName;
	 private String shareType;
	 private int quantity;
	 private double unitPrice;
	 private double total;
}
