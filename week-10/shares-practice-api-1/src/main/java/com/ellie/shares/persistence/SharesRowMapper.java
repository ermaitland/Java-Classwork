package com.ellie.shares.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.ellie.shares.entity.Shares;

public class SharesRowMapper implements org.springframework.jdbc.core.RowMapper<Shares>{
	

	@Override
	public Shares mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Shares shares=new Shares();
		
		shares.setShareId(resultSet.getString("SHAREID"));
		shares.setShareName(resultSet.getString("SHARENAME"));
		shares.setSharePrice(resultSet.getDouble("SHAREPRICE"));
		
		return shares;
	}
}
