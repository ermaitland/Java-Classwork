import java.util.Scanner;
// Which number is bigger? Number 1 or Number 2?
public class GreaterNumClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1, number2;
		
		System.out.println("Enter First Number : " );
		number1=scanner.nextInt();
		System.out.println("Enter Second Number : ");
		number2=scanner.nextInt();
		
		if(number1 > number2) {
			System.out.println(number1 + " is bigger than "+number2);
		}else if(number1 == number2) {
			System.out.println(number1 +" is equal to "+number2);
		}else{
			System.out.println(number1 + " is smaller than "+number2);
		}

	}

}
