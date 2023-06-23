package com.ellie.dvd.persistence;

import java.util.List;

import com.ellie.dvd.entity.DVD;

public interface DVDDao {
	List<DVD> getAllRecords();
	int addRecord(DVD dvd);
	int deleteRecord(int id);
	int updateRecord(int id, int newRating);
}
