package com.ellie.dvd.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.ellie.dvd.entity.DVD;
import com.ellie.dvd.service.DVDService;
import com.ellie.dvd.service.DVDServiceImpl;

@Component("dvdPresentation")
public class DVDUserInterfaceImpl implements DVDUserInterface {
	DVDService dvdService;
	
	public DVDUserInterfaceImpl(@Autowired DVDService dvdService) {
		super();
		this.dvdService = dvdService;
	}
	@Override
	public void showMenu() {
		System.out.println("1. Show All DVDs");
		System.out.println("2. Add new DVD");
		System.out.println("3. Delete DVD By ID");
		System.out.println("4. Edit a DVDs rating");
		System.out.println("5. Exit");
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		case 1:
			List<DVD> dvdList=dvdService.getAllDVDs();
			for(DVD dvd:dvdList)
			{
				System.out.println(dvd);
			}
			break;
		case 2:
			DVD newdvd=new DVD();
			
			System.out.println("Enter DVD ID : ");
			newdvd.setDvdId(scanner.nextInt());
			System.out.println("Enter Film Name : ");
			newdvd.setTitle(scanner.next());
			System.out.println("Enter MPAA Rating : ");
			newdvd.setMPAA_rating(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Enter Director's name : ");
			newdvd.setDirectorName(scanner.next());
			System.out.println("Enter Studio Name : ");
			newdvd.setStudio(scanner.next());
			System.out.println("Enter User Rating : ");
			newdvd.setUserRating(scanner.nextInt());
			if(dvdService.addDVD(newdvd))
				System.out.println("New DVD Added");
			else
				System.out.println("DVD Not Added");
			
			break;
		case 3:
			System.out.println("Enter DVD ID : ");
			int id=scanner.nextInt();

			if(dvdService.deleteDVDById(id))
				System.out.println("DVD Deleted");
			else
				System.out.println("DVD Not Deleted");
			break;
		case 4:
			System.out.println("Enter DVD ID : ");
			int dvdId=scanner.nextInt();
			System.out.println("Enter new rating : ");
			int newRating=scanner.nextInt();
			if(dvdService.updateRating(dvdId, newRating))
				System.out.println("DVD has a new rating!");
			else
				System.out.println("Unable to process rating change");
			break;
		case 5:
			System.out.println("Thanks for using DVD Library");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}
		
	}

}
