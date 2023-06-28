package com.ellie.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ellie.entity.DVD;
import com.ellie.model.persistance.DVDDao;
import com.ellie.model.persistance.DVDDaoImpl;

@Service
public class DVDServiceImpl implements DVDService {
	private DVDDao dvdDao;
	
	public DVDServiceImpl(@Autowired DVDDao dvdDao) {
		super();
		this.dvdDao = dvdDao;
	}
	
	@Override
	public List<DVD> getAllDVDs() {
		return dvdDao.getAllRecords();
	}

	@Override
	public DVD searchDVDByTitle(String title) {
		return dvdDao.getDVDByTitle(title);
	}


}
