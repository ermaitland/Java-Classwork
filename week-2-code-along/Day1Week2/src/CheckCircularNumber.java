import java.util.Scanner;

public class CheckCircularNumber {

	public static void main(String[] args) {
//		102564
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number you want to check as a circular number : ");
		int num = scanner.nextInt();
		int remainder=remainder(num);
		int potential_Cir=num*remainder;
		int divide=divideTen(num);
		int i;
		int finalNo = 0;
		int secondFinal =0;
		System.out.println(potential_Cir);
		for(i=potential_Cir;potential_Cir<0;i=i/10) {
			System.out.println(i);
//			if(i<10)
//				System.out.println(i);
//				finalNo=i;
//			if(i<100)
//				System.out.println(i);
//				secondFinal=i%10;
			}
	System.out.println(finalNo);
	System.out.println(secondFinal);
	if(remainder(num) == finalNo) {
		
		if(remainder(divide)==secondFinal) {
			System.out.println("Circular Number");
		}
	}
	
	
	}
	
	public static int divideTen(int number) {
		return number/10;
	}
	public static int remainder(int number) {
		return number%10;
	}
	 public static int circulate_func( int n, int divisor_part ){
         if( n < 10 ) return n; 
         else return ( n % divisor_part ) * 10 + n / divisor_part; 
   
}
}