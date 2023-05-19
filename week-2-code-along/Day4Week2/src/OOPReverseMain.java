import java.util.Scanner;

/*
 * Syntax for object creation is:
 * ClassName objectName=new ClassName();
 * 
 * want to access: objectName.method()  ===> e.g if you want the method
 * 
 * class: Encapsulation
 * method: data handling
 * private access modifier : data hiding
 */
public class OOPReverseMain {

	public static void main(String[] args) {
		ReverseNumber reverse=new ReverseNumber();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number to reverse :");
		reverse.setNumber(scanner.nextInt());
		System.out.println(reverse.getReverse());
	}

}
