import java.util.Scanner;

public class IterativeDoWhileLoop {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int day;
		String choice;
		do {
		
		System.out.println("Enter Day No to display day Name (1-7) :");
		day= scanner.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value : "+ day);
		}
		
		System.out.println("Do you wish to enter more day numbers (Y/N)?");
		choice=scanner.next();
		}while(choice.equalsIgnoreCase("y"));
		System.out.println("Goodbye, have a good day!");
	}

}


/*
 * With While loop: (but not preferred use);
 * 
 * String choice='"Y";
 * while(choice.equalsIgnoreCase("y"){
 * 	System.out.println("Enter Day No to display day Name (1-7) :");
		day= scanner.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value : "+ day);
		}
 */

