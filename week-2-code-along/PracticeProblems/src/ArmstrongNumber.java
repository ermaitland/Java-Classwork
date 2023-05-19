import java.util.Scanner;

/*Write a Java program to print all Armstrong numbers between 1 to n
An Armstrong number is a n-digit number that is equal to the sum of nth power of its digits. For example,
6 = 61 = 6
371 = 33 + 73 + 13 = 371 (edited)
*/
public class ArmstrongNumber {

	public static void main(String[] args) {
		//each digit to the power of number of digits added together equals the number.
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number you want to check if is an armstrong number : ");
		int num=scanner.nextInt();
		
		int lengthOfNum=lengthOfNum(num);
		System.out.println(lengthOfNum);
		int number=num;
		int i;
		double calculation=0;
		for(i=number;i>0;i=i/10) {
			calculation=(int) calculation+(Math.pow((number%10), lengthOfNum));
			System.out.println(calculation);
		}
		if(calculation==num) {
			System.out.println(num+" is an Armstrong number");
		}else {
			System.out.println(num+" is not an Armstrong number");
		}
	}
public static int lengthOfNum(int num) {
	int i;
	int lengthOfNum=0;
	for(i=num;i>=1;i=i/10) {
		System.out.println(i);
		lengthOfNum++;
	}
	return lengthOfNum;
}
	
	
}
