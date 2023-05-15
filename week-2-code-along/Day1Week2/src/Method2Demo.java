import java.util.Scanner;

public class Method2Demo {

	public static void main(String[] args) {
		
	int sumOfTwoNumbers = sum();
	
	System.out.println(sumOfTwoNumbers);

	}
/*
 * With return, without argument/parameters: Type 2.
 * With return type : Output will be in : Caller function
 * Without Arguments : Input will be in : Calling function
 */
	
	public static int sum() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the first number : ");
	int num1=scanner.nextInt();
	System.err.println("Enter the second number : ");
	int num2=scanner.nextInt();
	
	int answer=num1+num2;
	
//	return the value to the caller method
	return answer;
	}
}
