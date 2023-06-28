package com.ellie.model.service;

import java.util.List;

import com.ellie.entity.DVD;

public interface DVDService {
	List<DVD> getAllDVDs();
	public DVD searchDVDByTitle(String title);
}
