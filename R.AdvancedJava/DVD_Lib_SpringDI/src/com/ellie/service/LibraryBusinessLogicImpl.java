package com.ellie.service;

import java.util.LinkedList;

import com.ellie.dto.Single_DVD;
import com.ellie.persistance.LibraryDataAccess;
import com.ellie.persistance.LibraryDataAccessImpl;

public class LibraryBusinessLogicImpl implements LibraryBusinessLogic {
	//4)eliminate the opject
	private LibraryDataAccess dataAccess;
	//=new LibraryDataAccessImpl();
	
	//5) Constructor with ONLY data acess
	
	private LinkedList<Single_DVD> dvdList;
	public LibraryBusinessLogicImpl(LibraryDataAccess dataAccess) {
		super();
		this.dataAccess = dataAccess;
	}

	//3) change to instance and LibDataAccess
	{
		try {
			dvdList=LibraryDataAccessImpl.readRecords();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public LinkedList<Single_DVD> getAllDvds() {	
		return dvdList;
	}

	@Override
	public boolean addDVD(Single_DVD dvd) {
		return dvdList.add(dvd);
	}

	@Override
	public boolean deleteDVD(String title) {
		for(Single_DVD dvd:dvdList) {
			if(dvd.getTitle().equalsIgnoreCase(title)){
				return dvdList.remove(dvd);
			}
		}
		return false;
	}

	@Override
	public void saveAllDVDs() {
		try {
			dataAccess.writeRecords(dvdList);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Single_DVD getSingleDVD(String title) {
		for(Single_DVD dvd:dvdList) {
			if(dvd.getTitle().equalsIgnoreCase(title)){
				return dvd;
			}
		}
		return null;
	}

}
