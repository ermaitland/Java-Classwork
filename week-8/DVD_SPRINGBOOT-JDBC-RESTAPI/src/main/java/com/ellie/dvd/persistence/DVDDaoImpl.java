package com.ellie.dvd.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ellie.dvd.entity.DVD;

@Repository("dvdDao")
public class DVDDaoImpl implements DVDDao {
	Connection connection=null;
	PreparedStatement preparedStatement;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<DVD> getAllRecords() {
		String query = "SELECT * FROM DVD";
		return jdbcTemplate.query(query, new DVDMapper());
	}

	@Override
	public int addRecord(DVD dvd) {
			String query = "INSERT INTO DVD VALUES(?,?,?,?,?,?)";
			return jdbcTemplate.update(query, dvd.getDvdId(), dvd.getTitle(), dvd.getMPAA_rating(),
					dvd.getDirectorName(), dvd.getStudio(), dvd.getUserRating());
	}

	@Override
	public int deleteRecord(int id) {
			String query = "DELETE FROM DVD WHERE DVD_ID=?";
			return jdbcTemplate.update(query, id);
	}

	@Override
	public int updateRecord(int id, int newRating) {
			String query = "UPDATE DVD SET USER_RATING="+newRating+" where DVD_ID="+id;
			return jdbcTemplate.update(query);
	}

}
