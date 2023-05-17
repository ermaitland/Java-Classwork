import java.util.Scanner;

public class PracticeFactorial {

static int factorNumber;
static int factorTimes=0;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number you want to factor ? ");
		factorNumber=scanner.nextInt();
		System.out.println("You chose "+factorNumber);
		factor();
		
	}
public static void factor() {
	int i;
	int total=0;
	for(i=1;i<=factorNumber;i++) {
		if(factorNumber%i==0) {
			System.out.print(i+" ");
			total+=i;
			factorTimes++;
		}
	}
	System.out.println("\nThe number of factors is has is "+factorTimes);
	if((total-factorNumber)==factorNumber) {
		System.out.println("This number is a perfect number!");
	}
	if(factorTimes==2) {
		System.out.println("This number is a prime!");
	}
}
}
