import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
//becomes the caller method - called by sum();
sum();
	}
	
	
	/*
	 * without return type and without argument
	 * without argument : Input in calling method
	 * without return type : Output in calling method
	 */

public static void sum() {
// the called method
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Number one : ");
	int num1=scanner.nextInt();
	System.out.println("Enter Number two : ");
	int num2=scanner.nextInt();
	
	int sum= num1+num2;
	System.out.println("Sum of those numbers is : "+sum);
}
	
}
