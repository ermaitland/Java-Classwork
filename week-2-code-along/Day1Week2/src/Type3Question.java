import java.util.Scanner;

public class Type3Question {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number you want to get the factorial for : ");
		int num=scanner.nextInt();
		for(int count=0; num<=0; count++) {
			System.out.println("Number must be greater than 0. Please re-enter a number :");
			num=scanner.nextInt();
		}
		
		factorial(num);

	}

	public static void factorial(int number) {
		
		int i;
		int answer=number;
		for(i=number-1;i>0;i--) {
			answer *= i;
		}
		System.out.println("The factorial of "+number+" is : "+answer);
	}
}
