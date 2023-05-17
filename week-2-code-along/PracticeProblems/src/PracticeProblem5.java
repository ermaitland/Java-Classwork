import java.util.Random;
import java.util.Scanner;
public class PracticeProblem5 {

	public static void main(String[] args) {
		  Random randomizer = new Random();
//
//	        System.out.println("Random can make integers: " + randomizer.nextInt());
//	        System.out.println("Or a double: " + randomizer.nextDouble());
//	        System.out.println("Or even a boolean: " + randomizer.nextBoolean());
//
//	        int num = randomizer.nextInt(100);
//	        int number2= (int)(Math.random()*3);
//	        System.out.println("USING MATH.RANDOM = "+number2);
//
//	        System.out.println("You can store a randomized result: " + num);
//	        System.out.println("And use it over and over again: " + num + ", " + num);
//
//	        System.out.println("Or just keep generating new values");
//	        System.out.println("Here's a bunch of numbers from 0 - 100: ");
//
//	        System.out.print(randomizer.nextInt(50)+50 + ", "); // having this as (50)+50, means that it is numbers from 50-100
//	        System.out.print(randomizer.nextInt(101) + ", ");
//	        System.out.print(randomizer.nextInt(101) + ", ");
//	        System.out.print(randomizer.nextInt(101) + ", ");
//	        System.out.print(randomizer.nextInt(101) + ", ");
//	        System.out.println(randomizer.nextInt(101));
		
//	********** guess again ***************************
		System.out.println("I bet you can't guess the number I am thinking of.... ");
		int randomNumber=randomizer.nextInt(101);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ok.. I have my number, please guess yours.... ");
		int guess=scanner.nextInt();
		
		do {
			if(guess==randomNumber) {
				System.out.println("Thats incredible.... you got it right!");
			}else {
				System.out.println("Unlucky!! that was wrong... please guess again? ");
				guess=scanner.nextInt();
			}
		}while(guess != randomNumber);
	}

}
