import java.util.Scanner;

public class ArrayAssignment2 {

	public static void main(String[] args) {
		double valueArray[]=new double[8];
		Scanner scanner=new Scanner(System.in);
		
		for (int index = 0; index < 8; index++) {
			System.out.println("Enter " + (index + 1) + " value : ");
			valueArray[index] = scanner.nextInt();
		}
		
		double total = totalArray(valueArray, 8);
		
		System.out.println("The total value of the array is : "+total);
	}
	
public static double totalArray(double array[], int totalNum ) {
	double total = 0;
		for (int index = 0; index < totalNum; index++) {
			total += array[index];
		}
		return total;
}
}
