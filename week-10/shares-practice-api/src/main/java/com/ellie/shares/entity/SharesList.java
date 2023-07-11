package com.ellie.shares.entity;

import java.util.List;

public class SharesList {
	
private List<Shares> shares;
	
	public SharesList() {
		
	}

	public SharesList(List<Shares> shares) {
		super();
		this.shares = shares;
	}

	public List<Shares> getShares() {
		return shares;
	}

	public void setShares(List<Shares> shares) {
		this.shares = shares;
	}
}
