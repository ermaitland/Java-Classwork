package com.ellie.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DVD {
	
	@Id
	private int dvd_ID;
	private String title;
	private int MPAA_rating;
	private String director_name;
	private String studio;
	private int user_rating;
}
