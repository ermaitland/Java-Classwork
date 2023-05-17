import java.util.Scanner;

public class VaribleDeclorationQuestion1 {

static Scanner scanner=new Scanner(System.in);
static double total=0;
static double price=0;
static int numberSold;
final static double product1=22.50;
final static double product2=44.50;
final static double product3=9.98;

public static void main(String[] args) {
		
		while(true) {
			onGoingTotal();
		}
		}

public static double totalValue(double price, int numberSold, double totalSoFar) {
		return totalSoFar+(price*numberSold);
	}
public static void onGoingTotal() {
	System.out.println("Please enter the number product bought, 1-3. Press any other key to exit : ");
	int productNumber=scanner.nextInt();
	switch(productNumber) {
		case 1:
			price = product1;
			break;
		case 2:
			price = product2;
			break;
		case 3:
			price=product3;
			break;
		default:
			System.exit(0);
		}

	System.out.println("How many of product "+productNumber+" was sold ?");
	numberSold=scanner.nextInt();
	
	total=totalValue(price,numberSold,total);

	System.out.println("The total retail value of all products sold is £"+total);
}
}
