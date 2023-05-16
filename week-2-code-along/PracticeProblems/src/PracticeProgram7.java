import java.util.Scanner;

public class PracticeProgram7 {

	public static void main(String[] args) {
//		******** Blackbirds *********************
//		int birdsInPie = 0;
//        for (int i = 1; i <= 24; i++) {
//            System.out.println("Blackbird #" + i + " goes into the pie!");
//            birdsInPie++;
//        }
//
//        System.out.println("There are " + birdsInPie + " birds in there!");
//        System.out.println("Quite the pie full!");
		
// *********** FizzBuzz *************************

		Scanner scanner=new Scanner(System.in);
		System.out.println("How many FizzBuzz's do you need in your life? ");
		int num=scanner.nextInt();
		int i;
		int numOfFizzBuzz=num;
		for(i=0;numOfFizzBuzz>0;i++) {
			if(i==0) 
				System.out.println(0);
			else if(i%3==0 && i%5==0) {
				System.out.println("fizzbuzz");
				numOfFizzBuzz--;
			}
			else if(i%3==0) {
				System.out.println("fizz");
			    numOfFizzBuzz--;
			}
			else if(i%5==0) {
				System.out.println("buzz");
				numOfFizzBuzz--;
			}
			else 
				System.out.println(i);
		}
		System.out.println("TRADITION!!!!!");
		
	}

}
