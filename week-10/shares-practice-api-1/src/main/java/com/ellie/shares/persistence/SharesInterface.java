package com.ellie.shares.persistence;

import java.util.List;

import com.ellie.shares.entity.Shares;

public interface SharesInterface {
	public Shares getSharesById(String id);
	public List<Shares> getAllShares();
}
