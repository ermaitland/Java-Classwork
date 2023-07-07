package com.ellie.model.service;

import java.util.List;

import com.ellie.entity.DVD;

public interface DVDService {
	DVD getDVDById(String title);
	List<DVD> getAllDVDs();
	boolean addDVD(DVD dvd);
	boolean deleteDVDById(String title);
	boolean incrementRating(int dvdId,int rating);
}
