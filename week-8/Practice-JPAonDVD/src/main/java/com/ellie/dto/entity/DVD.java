package com.ellie.dto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name="DVD-LIB")
public class DVD {
	private int dvdId;
	private String title;
	private int MPAA_rating;
	private String directorName;
	private String studio;
	private int userRating;
}
