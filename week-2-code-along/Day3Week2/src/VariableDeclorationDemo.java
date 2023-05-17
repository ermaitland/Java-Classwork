import java.util.Scanner;

public class VariableDeclorationDemo {

static int number; //can declare a variable where everyone can reach it
static long reverse=0L;	
static Scanner sc=new Scanner(System.in); //can declare the scanner so you not repeating and repeating it
	public static void main(String[] args) {
		inputNumber();
		reverseNumber();
		displayReverse();
		
	}

	public static void reverseNumber() {
		int num=number;
		while(num>0) {
			reverse=reverse*10+num%10;
			num=num/10;
		}
	}

	public static void inputNumber() {
		System.out.println("Enter Number :");
		number=sc.nextInt();
	}
	public static void displayReverse() {
		System.out.println("Print out : "+number+" in reverse "+reverse);
	}
}
//make the important vaiables accessable to everyone, then pass them through to assign them by a user and 
// all methods can access the variable.
// Be careful as its easy to corrupt the value and therefore can ruin the whole code