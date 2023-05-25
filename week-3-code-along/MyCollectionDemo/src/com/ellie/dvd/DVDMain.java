package com.ellie.dvd;

import java.util.LinkedList;

public class DVDMain {

	public static void main(String[] args) {
		LinkedList<DVDClass> dvd=new LinkedList<DVDClass>();
		
		dvd.add(new DVDClass("Legally Blonde",2002, 8, 4,"Warner Bros","Great Film"));
		dvd.add(new DVDClass("Superbad",2012, 9, 7,"GoldFilm","5/10"));
		dvd.add(new DVDClass("Miss Conginiality",2001, 9, 2,"Funny Film Studio","10/10"));
		dvd.add(new DVDClass("Cars",2000, 4, 1,"Disney","Bit boring"));
		dvd.add(new DVDClass("Dune",2021, 10, 9,"Warner Bros","Fantastic"));
		dvd.add(new DVDClass("Star Wars",1997, 8, 4,"Warner Bros","10/10"));
		
		for(DVDClass film:dvd) {
			System.out.println(film);
		}

	}

}
