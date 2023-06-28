package com.ellie.model.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ellie.entity.DVD;

@Repository
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
	public DVD getDVDByTitle(String title) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM DVD WHERE TITLE=?", new DVDMapper(), title);
		}
		catch(EmptyResultDataAccessException ex) {
			return null;
		}
	}

}
