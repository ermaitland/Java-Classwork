import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number to calculate the factorial for :");
		factorial.setNumber(scanner.nextInt());
		System.out.println("The factorial is : "+factorial.getFactorial());

	}

}
