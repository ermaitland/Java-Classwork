import java.util.Scanner;
/*
Class Assignment
Write a program to grade the steel as per the following conditions
Condition 1: Carbon Content must be greater then 5700
Condition 2 : Hardness must be less then 0.7
Condition 3: Strength must be greater than and equal to 97
Grades are as follows
Grade is 10 is all three condition are met
Grade is 9 if condition 1 and 2 are met
Grade is 8 if condition 2 and 3 are met
Grade is 7 if condition 1 and 3 are met
Grade is 6 if any one condition is met
Grade is 5 if none of the conditions are met
 */
public class SwitchPracticeQuestion {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int content, strength;
		float hardness;
		
		System.out.println("Enter the Carbon Content of the steel : ");
		content=scanner.nextInt();
		
		System.out.println("Enter the Hardness of the steel : ");
		hardness=scanner.nextFloat();
		
		System.out.println("Enter the Strength of the steel : ");
		strength=scanner.nextInt();
		

		if(content > 5700 && hardness < 0.7 && strength >= 97) 
			System.out.println("The steel is grade 10");
		else if(content > 5700 && hardness < 0.7)
			System.out.println("The steel is grade 9");
		else if(hardness < 0.7 && strength >= 97)
			System.out.println("The steel is grade 8");
		else if(content > 5700 && strength >= 97)
			System.out.println("The steel is grade 7");
		else if(content > 5700 || hardness < 0.7 || strength >= 97)
			System.out.println("The steel is grade 6");
		else 
			System.out.println("The steel is grade 5");
	}

}
