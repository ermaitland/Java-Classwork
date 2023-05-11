import java.util.Scanner;

public class GreaterThanZero {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter your number : ");
		number=scanner.nextInt();
		
		if(number>0) 
			System.out.println(number +" is larger than 0");
		else if(number==0) 
			System.out.println(number +" is equal to 0");
		else 
			System.out.println(number +" is smaller than 0");
		
	}
	
}
