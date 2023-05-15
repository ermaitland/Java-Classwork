import java.util.Scanner;

public class FactorialQuestion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num;
		
		System.out.println("Please enter the number you want to get the factorial for : ");
		num=scanner.nextInt();
		
		int i;
		int answer=num;
		for(i=num-1;i>0;i--) {
			answer*=i;
		}
		System.out.println("The factorial of "+num+" is "+answer);

	}

}
/*Would need to opt for an if condition first to make sure number is not negative or 0
*/