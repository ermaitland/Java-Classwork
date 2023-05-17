import java.util.Scanner;

public class PracticeInterestCalculator {

	static double invest;
	static double newInvest;
	static int years;
	static double interest;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How much do you want to invest?");
		invest=scanner.nextInt();
		System.out.println("How long are you investing?");
		years=scanner.nextInt();
		System.out.println("And whats the annual interest rate?");
		double annualInterest=scanner.nextInt();
		interest=(annualInterest/4);
		System.out.println(interest);
		growth();
		
	}
public static void growth() {
	int i;
	for(i=0;i<years;i++) {
		System.out.println("Year "+(i+1)+":");
		System.out.println("You begain with "+invest);
		newInvest=invest;
		for(int j=0;j<4;j++) {
			newInvest= newInvest * (1 + (interest / 100));
		}
		System.out.println("New invest num "+newInvest);
		double yearEarn=newInvest-invest;
		System.out.println("You earned :"+yearEarn);
		System.out.println("Your total was :"+newInvest);
		invest=newInvest;
	}
}
}
