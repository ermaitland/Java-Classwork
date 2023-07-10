package com.ellie.shares.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ellie.shares.entity.Shares;
import com.ellie.shares.persistence.SharesImpl;
import com.ellie.shares.persistence.SharesInterface;

@Service
public class SharesServiceImpl implements SharesServiceInterface {

	@Autowired
	private SharesImpl sharesDao;	
	
	@Override
	public Shares searchSharesById(String id) {
		return sharesDao.getSharesById(id);
	}

	@Override
	public List<Shares> getAllShares() {
		return sharesDao.getAllShares();
	}

}
