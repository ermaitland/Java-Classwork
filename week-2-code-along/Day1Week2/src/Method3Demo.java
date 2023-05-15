import java.util.Scanner;

public class Method3Demo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1=scanner.nextInt();
		System.out.println("Enter second number : ");
		int num2=scanner.nextInt();
		sum(num1,num2);

	}
/*
 * Without return type but with arguments/parameters;
 * With Argument : Input in Caller Method
 * Without Return Type : Output in Calling Method
 */
	
	public static void sum(int number1, int number2) {
		int sum = number1+number2;
		System.out.println("The sum is : "+ sum);
	}
	
}
