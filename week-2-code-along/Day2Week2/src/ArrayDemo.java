import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
//		stating age in an array with int variables. Decloration
		int ageArray[];
		
		System.out.println("Enter how many people you want to store the age for :");
		int totalPerson=scanner.nextInt();
		
//		Allocation of memory (size of array). Initializing the memory
		ageArray=new int[totalPerson];
		
		for(int index=0;index<totalPerson;index++) {
			System.out.println("Enter "+(index+1)+" person age");
			ageArray[index]=scanner.nextInt();
		}
		
		for(int index=0;index<totalPerson;index++) {
			System.out.println("Age of "+(index+1)+" person : "+ageArray[index]);
		}
	
		
	}

}
