package com.ellie.dvd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DVD {
	private int dvdId;
	private String title;
	private int MPAA_rating;
	private String directorName;
	private String studio;
	private int userRating;
}
