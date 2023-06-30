package com.ellie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ellie.dto.entity.DVD;
import com.ellie.persistence.DVDDao;

@Service
public class DVDServiceImpl implements DVDService {

	@Autowired
	private DVDDao dvdDao;
	
	@Override
	public DVD addNewDVD(DVD dvd) {
		if (searchDVDById(dvd.getDvdId()) == null)
			return dvdDao.save(dvd);
		else
			return null;
	}

	@Override
	public List<DVD> getAllDVDs() {
		return dvdDao.findAll();
	}

	@Override
	public DVD searchDVDById(int dvdId) {
		DVD dvd = dvdDao.findById(dvdId).orElse(null);
		return dvd;
	}

	@Override
	public DVD deleteDVDById(int dvdId) {
		DVD dvd = searchDVDById(dvdId);
		if (dvd != null)
			dvdDao.deleteById(dvdId);
		return dvd;
	}

	@Override
	public DVD incrementDVDRating(int dvdId, int incrementAmount) {
		DVD dvd = searchDVDById(dvdId);
		if (dvd != null) {
			dvd.setUserRating(dvd.getUserRating()+incrementAmount);
			dvdDao.save(dvd);
		}
		return dvd;
	}

	@Override
	public List<DVD> getDVDByDirector(String director) {
		return dvdDao.findEmployeesByDirector(director);
	}

	@Override
	public List<DVD> getDVDByName(String name) {
		return dvdDao.findDVDByName(name);
	}

}
