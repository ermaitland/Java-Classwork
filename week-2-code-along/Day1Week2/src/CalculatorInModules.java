import java.util.Scanner;

public class CalculatorInModules {

	public static void main(String[] args) {
		int action, ans, number1, number2;
		while(true){
		System.out.println("--------------------------------");
		action=enterValue("Please enter the action you would like to take: \n1 for +\n2 for -\n3 for *\n4 for /\n5 to exit ");
		switch(action) {
		case 1:
			number1=enterValue("Enter the first number you want to use : ");
			number2=enterValue("Enter the second number you want to use : ");
			ans = sum(number1,number2);
			System.out.println(number1+"+"+number2+"="+ans);
			break;
		case 2:
			number1=enterValue("Enter the first number you want to use : ");
			number2=enterValue("Enter the second number you want to use : ");
			ans = minus(number1,number2);
			System.out.println(number1+"-"+number2+"="+ans);
			break;
		case 3:
			number1=enterValue("Enter the first number you want to use : ");
			number2=enterValue("Enter the second number you want to use : ");
			ans = multiply(number1,number2);
			System.out.println(number1+"*"+number2+"="+ans);
			break;
		case 4:
			number1=enterValue("Enter the first number you want to use : ");
			number2=enterValue("Enter the second number you want to use : ");
			ans =divide(number1,number2);
			System.out.println(number1+"/"+number2+"="+ans);
			break;
		case 5:
			System.out.println("Thank you, goodbye!");
			System.exit(0);
		default:
			throw new IllegalArgumentException("Unexpected value: "+ action);
		}
		}
	}
	
public static int enterValue(String prompt) {
	Scanner scanner=new Scanner(System.in);		
	System.out.println(prompt);
	int value=scanner.nextInt();
	return value;
}
public static int sum(int a, int b) {
	return a+b;
}
public static int divide(int a, int b) {
	return a/b;
}
public static int multiply(int a, int b) {
	return a*b;
}
public static int minus(int a, int b) {
	return a-b;
}
}
