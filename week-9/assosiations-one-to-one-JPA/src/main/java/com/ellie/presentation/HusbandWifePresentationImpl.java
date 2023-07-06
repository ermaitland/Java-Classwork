package com.ellie.presentation;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ellie.dto.entity.Husband;
import com.ellie.dto.entity.Wife;
import com.ellie.service.HusbandWifeServiceImpl;

@Component
public class HusbandWifePresentationImpl implements HusbandWifePresentation {
	
	@Autowired
	HusbandWifeServiceImpl HWService;
	
	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		case 1:
			Husband husband = new Husband();
			System.out.println("Enter Husband Id: ");
			int hId=scanner.nextInt();
			husband.setHusbandId(hId);
			System.out.println("Enter Husband Name:");
			String hName = scanner.next();
			husband.setHusbandName(hName);
			HWService.addHusband(husband);
			System.out.println("Husband Added");
			break;
		case 2:
			Wife wife=new Wife();
			System.out.println("Enter Wife ID :");
			String wId=scanner.next();
			wife.setWifeId(wId);
			System.out.println("Enter Wife Name : ");
			wife.setWifeName(scanner.next());
			Husband hubby=new Husband();
			System.out.println("Enter Husband ID : ");
			hubby.setHusbandId(scanner.nextInt());
			wife.setHubby(hubby);
			HWService.addWife(wife);
			System.out.println("Wife Added");
			break;
		case 3:
			System.out.println("Enter Wife ID");
			String id=scanner.next();
			Wife searchedWife=HWService.searchWifeById(id);
			System.out.println(searchedWife);
			break;
		case 4:
			System.out.println("Thanks for visiting");
			System.exit(0);
		default:
			System.out.println("Invalid choice");
			
		}

	}

	@Override
	public void showMenu() {

		System.out.println("1. Add Husband");
		System.out.println("2. Add Wife");
		System.out.println("3. Search Wife by ID");
		System.out.println("4. Exit");
	}

}
