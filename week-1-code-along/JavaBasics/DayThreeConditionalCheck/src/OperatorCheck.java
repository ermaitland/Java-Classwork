import java.util.Scanner;

public class OperatorCheck {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int number1, number2;
		System.out.println("Enter your first number : ");
		number1=scanner.nextInt();
		
		System.out.println("Enter your second number : ");
		number2=scanner.nextInt();
		
		System.out.println("Enter Operator");
		String operator = scanner.next();
		
		
		int answer;
		switch(operator) {
			case "+":
				answer = number1 + number2;
				System.out.println(answer);
				break;
			case "-":
				answer = number1 - number2;
				System.out.println(answer);
				break;
			case "*":
				answer = number1 * number2;
				System.out.println(answer);
				break;
			case "/":
				answer = number1 / number2;
				System.out.println(answer);
				break;
			case "%":
				answer = number1 % number2;
				System.out.println(answer);
				break;
			default:
				System.out.println("Invadlid Operator");
		}	
		
//		As an if/else statement: 
		/* if(operator.equals("-")){
		 * answer=number1-number2;
		 * System.out.println(answer);
		 * }
		 * else if(operator.equals("+"){
		 * answer=number1+number2;
		 * System.out.println(answer);
		 * }
		 * else if(operator.equals("*"){
		 * answer=number1*number2;
		 * System.out.println(answer);
		 * }
		 * else if(operator.equals("/"){
		 * answer=number1/number2;
		 * System.out.println(answer);
		 * }
		 *  else if(operator.equals("%"){
		 * answer=number1%number2;
		 * System.out.println(answer);
		 * }
		 * else{
		 * System.out.println("Invalid Operator");
		 * }
		 */
		
		
	}

}
