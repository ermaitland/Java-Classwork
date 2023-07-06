package com.ellie.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ellie.entity.DVD;
import com.ellie.model.persistence.DVDDao;

@Service
public class DVDServiceImpl implements DVDService {
	
	@Autowired
	DVDDao DVDDao;
	
	@Override
	public DVD getDVDById(int id) {
		return DVDDao.findById(id).orElse(null);
	}

}
