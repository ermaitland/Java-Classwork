import java.util.Scanner;

public class type1Question {

	public static void main(String[] args) {
		factorial();

	}
public static void factorial() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter the number you want to get the factorial of :");
	int num=scanner.nextInt();
	
	if(num <0) {
		System.out.println("Number must be greater than 0. Please re-enter a number :");
		num=scanner.nextInt();
	}
	
	int i;
	int answer=num;
	for(i=num-1;i>0;i--) {
		answer *= i;
	}
	System.out.println("The factorial of "+num+" is : "+answer);
}
}
