import java.util.Scanner;
// Convert data types
public class UserInputTwo {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		
		System.out.println("Enter whole no. : ");
		int wholeNo=Integer.parseInt(scanner.next());
		
		System.out.println("Whole number entered by user : "+wholeNo);
		
	}

}

/* Three types of error: 
 * 1) Syntax Error
 * 2) Logical Error e.g. equation error
 * 3) Runtime Error e.g. Logic is fine and syntax but there is something else which is wrong like 
 * no string equivalent or integer equivalent
 */
