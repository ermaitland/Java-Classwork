import java.util.Scanner;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String nameArray[];  // Declare
		System.out.println("How many peoples names do you want to store : ");
		int totalNames=scanner.nextInt();
		
		nameArray=new String[totalNames]; // Initialise memory
		
		for(int index=0;index<totalNames;index++) {
			System.out.println("Enter "+(index+1)+" person's name : ");
			nameArray[index]=scanner.next();
		}
		
		for(int index=0;index<totalNames;index++) {
			System.out.println("Name of "+(index+1)+" person : "+nameArray[index]);
		}

	}

}
