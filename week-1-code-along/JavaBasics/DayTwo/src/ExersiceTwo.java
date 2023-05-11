import java.util.Scanner;

public class ExersiceTwo {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter Value 1 : ");
		int value1 = scanner.nextInt();
		
		System.out.println("Enter Value 2 : ");
		int value2 = scanner.nextInt();
		
		System.out.println("Value 1 before swap : "+value1);
		System.out.println("Value 2 before swap : "+value2);
		
		int temp = value1;
		value1 = value2;
		value2 = temp;
		
		System.out.println("------------------------------");
		System.out.println("Value 1 after swap : "+value1);
		System.out.println("Value 2 after swap : "+value2);
	}

}
