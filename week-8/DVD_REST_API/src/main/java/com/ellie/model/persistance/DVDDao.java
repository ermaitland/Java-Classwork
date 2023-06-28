package com.ellie.model.persistance;

import java.util.List;

import com.ellie.entity.DVD;

public interface DVDDao {
	List<DVD> getAllRecords();
	public DVD getDVDByTitle(String title);
}
