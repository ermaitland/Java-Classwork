
package com.ellie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ellie.dto.entity.Husband;
import com.ellie.dto.entity.Wife;
import com.ellie.persistence.HusbandDao;
import com.ellie.persistence.WifeDao;

@Service
public class HusbandWifeServiceImpl implements HusbandWifeService{
	
	@Autowired
	private HusbandDao hDao;
	@Autowired
	private WifeDao wDao;
	
	@Override
	public void addHusband(Husband husband) {
		hDao.save(husband);
		
	}

	@Override
	public void addWife(Wife wife) {
		Husband husband= searchHusbandById(wife.getHubby().getHusbandId());
		wife.setHubby(husband);
		wDao.save(wife);
		
	}

	@Override
	public Husband searchHusbandById(int hId) {
		return hDao.findById(hId).orElse(null);
	}

	@Override
	public Wife searchWifeById(String wId) {
		return wDao.findById(wId).orElse(null);
	}

}
