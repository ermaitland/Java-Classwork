import java.util.Scanner;

/*
 * This is over modulisation but just to show how you can divide the parts into smaller sections to make it easier to repeat for
 * different values.
 */

public class SumSeriesDemo {

	public static void main(String[] args) {
		int n = readValue("Enter value of n to caluculate Sum of series : ");
		
		double resultSumSeries=sumSeries(n);
		System.out.println("Sum of series is "+resultSumSeries);

	}
	
	public static double sumSeries(int n) {
		double sumSer=0;
		for(int counter=1;counter<=n;counter++) {
			long factorial=factorial(counter);
			double divideResult=divide(factorial, counter);
			sumSer=sum(sumSer, divideResult);
			System.out.print(factorial+"/"+counter+" + ");
		}
		return sumSer;
	}

	public static double sum(double num1, double num2) {
		return num1+num2;
	}
	public static double divide(long num1, int num2) {
		return num1/num2;
	}
	public static long factorial(int num) {
		long factorial=1;
		while(num>=1)
			factorial*=num--;
		return factorial;
	}
	public static int readValue(String prompt) {
		Scanner scanner=new Scanner(System.in);
		System.out.println(prompt);
		int value=scanner.nextInt();
		return value;
	}
}
