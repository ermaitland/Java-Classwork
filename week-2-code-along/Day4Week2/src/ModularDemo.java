import java.util.Scanner;

public class ModularDemo {
// problem with modular programming languages - no "mistake" but due to split and then global variables
// allows for accidental corruption of variables as all modules can access them and change them. 
	//From this approach we developed Object Oriented Programming.
	static int number, reverse;
	static Scanner scanner=new Scanner(System.in);
	
	public static void input(int num) {
	number=num;
		
	}
	public static void calculateReverse() {
		while(number>0) {
			reverse=reverse*10+number%10;
			number=number/10; //corrupting the value of number.
		}
	}
	public static void displayReverse() {
		System.out.println("Reverse of "+number+" is "+reverse);
	}
	public static void main(String[] args) {
			System.out.println("Enter number :");
		int num = scanner.nextInt();
		
		input(num);
		
		calculateReverse();
		displayReverse();
	}

}
