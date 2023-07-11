package com.ellie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Shares {
	
	private String shareId;
	private String shareName;
	private double sharePrice; 
}
