package com.ellie.shares.service;

import java.util.List;

import com.ellie.shares.entity.Shares;

public interface SharesServiceInterface {
	
	public Shares searchSharesById(String id);
	public List<Shares> getAllShares();
}
