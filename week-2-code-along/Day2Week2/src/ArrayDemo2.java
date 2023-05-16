import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int array[]=new int[10];
		Scanner scanner=new Scanner(System.in);
		
		
		for(int index=0;index<10;index++) {
			System.out.println("Enter "+(index+1+" value :"));
			array[index]=scanner.nextInt();
		}
		
		int totalEven=0;
		int totalOdd=0;
		for(int index=0;index<10;index++) {
			if(checkEven(array[index]))
				totalEven++;
			else
				totalOdd++;
		}
		
		System.out.println("Total No of Even elements is : "+totalEven);
		System.out.println("Total No of Odd elements is : "+totalOdd);
	}
public static boolean checkEven(int number) {
	return number%2==0;
}
	
	
}
