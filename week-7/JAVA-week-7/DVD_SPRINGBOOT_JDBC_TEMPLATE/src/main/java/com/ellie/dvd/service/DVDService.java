package com.ellie.dvd.service;

import java.util.List;

import com.ellie.dvd.entity.DVD;

public interface DVDService {
	List<DVD> getAllDVDs();
	boolean addDVD(DVD dvd);
	boolean updateRating(int id,int newRating);
	boolean deleteDVDById(int id);
}
