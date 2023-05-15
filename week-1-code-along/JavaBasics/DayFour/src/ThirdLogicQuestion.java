import java.util.Scanner;

public class ThirdLogicQuestion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int originalNumber;
		
		System.out.println("Enter the number you want to reverse : ");
		originalNumber=scanner.nextInt();
		
		int number= originalNumber;
		int newNum=0;
		for(;number!=0;number =number/10) {
			newNum = newNum *10 +number%10;
		}
	System.out.println("Reversed...");
	System.out.println(newNum);
	
	if(originalNumber == newNum)
		System.out.println("This is a Mirrored number");
	else 
		System.out.println("This is not a Mirrored Number");
		
	}

}
/*if new number starts at 0, add the new number x10 (e.g 0) then add the first value - Continue this and then it will 
 * continue to add a single number onto the end of the calculation.
 * e.g you have 4, it goes to 40 then you add the next number e.g 6 so its 46.
 * Clubbing the remainder into one variable so it is a reverse number of the first number inputed by the user, and in 
 * one variable you are able to compare the forward and backward number to see if it is mirrored. 
 */
