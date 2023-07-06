package com.ellie.dto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
public class Wife {
	
	@Id
	private String wifeId;
	private String wifeName;
	
	@OneToOne
	private Husband hubby;
}
