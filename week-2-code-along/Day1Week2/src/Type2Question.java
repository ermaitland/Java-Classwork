import java.util.Scanner;

public class Type2Question {

	public static void main(String[] args) {
		
		int returnFactorial = factorial();
		System.out.println("The factorial is "+ returnFactorial);
		
	}

	public static int factorial() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number you want to get the factorial for : ");
		int num=scanner.nextInt();
		
		for(int count=0; num<=0; count++) {
			System.out.println("Number must be greater than 0. Please re-enter a number :");
			num=scanner.nextInt();
		}
		
		int i;
		int answer=num;
		for(i=num-1;i>0;i--) {
			answer *= i;
		}
		
		return answer;
	}

	
	
}
