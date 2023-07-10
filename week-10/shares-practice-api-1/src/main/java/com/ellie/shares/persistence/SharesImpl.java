package com.ellie.shares.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ellie.shares.entity.Shares;

@Repository
public class SharesImpl implements SharesInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Shares getSharesById(String id) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM SHARES WHERE SHAREID=?", new SharesRowMapper(), id);
		} catch (EmptyResultDataAccessException ex) {
			return null;
		}
	}

	@Override
	public List<Shares> getAllShares() {
		return jdbcTemplate.query("SELECT * FROM SHARES", new SharesRowMapper());
	}

}
