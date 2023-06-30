package com.ellie.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ellie.dto.entity.DVD;
import com.ellie.service.DVDService;

@Component
public class DVDPresentationImpl implements DVDpresentation {

	@Autowired
	DVDService dvdService;
	
	@Override
	public void showMenu() {
		System.out.println("1. Add a new DVD");
		System.out.println("2. View all DVDs");
		System.out.println("3. Find DVD by ID");
		System.out.println("4. Delete DVD by ID");
		System.out.println("5. Increment rating");
		System.out.println("6. Search DVD by Name");
		System.out.println("7. Search DVD by Director");
		System.out.println("8. Exit");

	}

	@Override
	public void preformMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			DVD dvd=new DVD();
			
			System.out.println("Enter DVD ID : ");
			dvd.setDvdId(scanner.nextInt());;
			System.out.println("Enter DVD Name : ");
			dvd.setTitle(scanner.next());
			System.out.println("Enter Directors Name : ");
			dvd.setDirectorName(scanner.next());
			System.out.println("Enter Studio : ");
			dvd.setStudio(scanner.next());
			System.out.println("Enter MPAA Rating : ");
			dvd.setMPAA_rating(scanner.nextInt());
			System.out.println("Enter your Rating : ");
			dvd.setUserRating(scanner.nextInt());
			
			if(dvdService.addNewDVD(dvd)!=null)
				System.out.println("DVD Added");
			else
				System.out.println("DVD Not Added");
			break;
		case 2:
			List<DVD> dvds=dvdService.getAllDVDs();
			for(DVD oneDvd:dvds) {
				System.out.println(oneDvd);
			}
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			System.out.println("Thanks for using the DVD Library");
			System.exit(0);
		default:
			System.out.println("Invalid choice");
		}

	}

}
