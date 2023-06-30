package com.ellie.service;

import java.util.List;

import com.ellie.dto.entity.DVD;

public interface DVDService {
	
	public DVD addNewDVD(DVD dvd);
	public List<DVD> getAllDVDs();
	public DVD searchDVDById(int dvdId);
	public DVD deleteDVDById(int dvdId);
	public DVD incrementDVDRating(int dvdId,int incrementAmount);
	public List<DVD> getDVDByDirector(String director);
	public List<DVD> getDVDByName(String name);
}
