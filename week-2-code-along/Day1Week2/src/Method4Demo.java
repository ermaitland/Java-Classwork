import java.util.Scanner;

public class Method4Demo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your first number : ");
		int num1=scanner.nextInt();
		System.out.println("Please enter your second number : ");
		int num2=scanner.nextInt();
		
		int sumOfTwoNumbers = sum(num1,num2);
		System.out.println(num1+" + "+num2+" = "+sumOfTwoNumbers);

	}
	
	/* Type 4: with arguments, with return type
	 * with arguments : input in : caller method
	 * with return type : output in : caller method
	 */

	public static int sum(int a, int b) {
		return a+b;
	}
	
}
