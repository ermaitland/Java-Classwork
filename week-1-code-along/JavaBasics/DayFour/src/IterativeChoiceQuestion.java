import java.util.Scanner;
/*
 * Whatever number the user enters, you should count the total: e.g - if they enter 5; 1+2+3+4+5=15.
 */

public class IterativeChoiceQuestion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num;
		
		System.out.println("Please enter the number you want to count : ");
		num=scanner.nextInt();
		
		int i;
		int answer=num;
		for(i=1;i<num;i++) {
			answer+=i;
			
		}
		System.out.println("The sum of "+num+" is "+answer);
	}
}
