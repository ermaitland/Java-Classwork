package com.ellie.dvd.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ellie.dvd.entity.DVD;

public class DVDMapper implements RowMapper<DVD> {

	@Override
	public DVD mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		int id = resultSet.getInt("DVD_ID");
		String title = resultSet.getString("TITLE");
		int mpaa = resultSet.getInt("MPAA_RATING");
		String directorName = resultSet.getString("DIRECTOR_NAME");
		String studio = resultSet.getString("STUDIO");
		int userRating = resultSet.getInt("USER_RATING");
		DVD dvd = new DVD(id, title, mpaa, directorName, studio, userRating);
		return dvd;
	}

}
