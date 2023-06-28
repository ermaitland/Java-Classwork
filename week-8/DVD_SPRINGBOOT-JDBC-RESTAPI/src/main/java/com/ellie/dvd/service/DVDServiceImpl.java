package com.ellie.dvd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ellie.dvd.entity.DVD;
import com.ellie.dvd.persistence.DVDDao;
import com.ellie.dvd.persistence.DVDDaoImpl;

@Service("dvdService")
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
	public boolean addDVD(DVD dvd) {
		return dvdDao.addRecord(dvd)>0;
	}

	@Override
	public boolean deleteDVDById(int id) {
		return dvdDao.deleteRecord(id)>0;
	}

	@Override
	public boolean updateRating(int id, int newRating) {
		return dvdDao.updateRecord(id, newRating)>0;
	}

}
