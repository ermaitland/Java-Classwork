package com.ellie.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ellie.entity.DVD;
import com.ellie.model.persistence.DVDDao;

@Service
public class DVDServiceImpl implements DVDService {
	
	@Autowired
	DVDDao DvdDao;
	
	@Override
	public DVD getDVDById(String title) {
		return DvdDao.findDVDByTitle(title);
	}

	@Override
	public List<DVD> getAllDVDs() {
		return DvdDao.findAll();
	}

	@Override
	public boolean addDVD(DVD dvd) {
		DVD newDvd=getDVDById(dvd.getTitle());
		if(newDvd==null) {
			DvdDao.save(dvd);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteDVDById(String title) {
		DVD delDVD=getDVDById(title);
		if(delDVD!=null) {
			DvdDao.deleteById(delDVD.getDvd_ID());
			return true;
		}
		return false;
	}

	@Override
	public boolean incrementRating(int dvdId, int rating) {
		if(DvdDao.updateRatingByDVDId(dvdId, rating)>0)
			return true;
		else
			return false;
	}

}
