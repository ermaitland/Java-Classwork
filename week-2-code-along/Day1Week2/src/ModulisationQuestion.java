import java.util.Scanner;

public class ModulisationQuestion {

	public static void main(String[] args) {
		int originalNumber = readValue("Enter the number you want to check for being mirrored : ");
		
		boolean answer = checkReverse(originalNumber);
		if(answer)
			System.out.println(originalNumber+" is a palindrome.");
			
		else 
			System.out.println(originalNumber+" is not a palindrome.");
	}
	

	
	public static int readValue(String prompt) {
		Scanner scanner=new Scanner(System.in);
		System.out.println(prompt);
		int value=scanner.nextInt();			
		return value;
	}
		
	public static int reverse(int number) {
		int newNum=0;
		for(;number!=0;number =number/10) 
			newNum = newNum *10 +number%10;
		return newNum;
	}
	
	public static boolean checkReverse(int number1) {
		int number2=reverse(number1);
		if(number1 == number2)
			return true;
		else 
			return false;

}	
	
	
	
}



