import java.util.Scanner;

public class IterativeTask {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter a number to be multiplied 10 times : ");
		int numberEntered = scanner.nextInt();
		
		int count=1;
		int answer;
		while(count <= 10) {
			answer=numberEntered*count;
			System.out.println("The number "+numberEntered+ " times by "+count+" is equal to "+answer);
			count++;
		}
	}

}
