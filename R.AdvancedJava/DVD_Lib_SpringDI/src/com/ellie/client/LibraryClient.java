package com.ellie.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ellie.ui.LibraryUserInterface;
import com.ellie.ui.LibraryUserInterfaceImpl;

public class LibraryClient {

	public static void main(String[] args) {
		//9) Edit the client to use the userInterface by changing libUser -> AppContext, then add LibUser = appCont.getBean("userInterface") 
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("DVD_Context.xml");
		
//		LibraryUserInterface libraryUserInterface=new LibraryUserInterfaceImpl();
		
		LibraryUserInterface libraryUserInterface=(LibraryUserInterface)applicationContext.getBean("userInterface");
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			libraryUserInterface.showMenu();
			System.out.println("Please enter what action you would like to take :");
			int action=scanner.nextInt();
			libraryUserInterface.performMenu(action);
		}
		

	}

}
