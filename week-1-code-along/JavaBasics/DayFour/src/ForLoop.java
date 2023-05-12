import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num;
		
		System.out.println("Enter the number you want to get the times table for : ");
		num=scanner.nextInt();
		
		int i;
		int answer;
		for(i=1;i<=10;i++) {
			answer=num*i;
			System.out.println(num+"x"+i+"="+answer);
		}
	}

}
