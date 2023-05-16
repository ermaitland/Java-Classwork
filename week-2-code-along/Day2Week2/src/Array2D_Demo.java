import java.util.Scanner;

public class Array2D_Demo {

	public static void main(String[] args) {
//		int arr[]= {10,20,30,40,50};
//		^ automatically initiated with size
//		System.out.println("Length of array is : "+arr.length);
		
//	 2D means two dimension
		
		int matrix[][]; //declaration
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows in matrix:");
		int rows=scanner.nextInt();
		
		System.out.println("Enter number of columns in matrix :");
		int cols=scanner.nextInt();
		
		matrix=new int[rows][cols]; // memory area
		
		for(int row=0;row<rows;row++) {
			for(int col=0;col<cols;col++) {
				System.out.println("Enter element at location :["+row+"]["+col+"]");
				matrix[row][col]=scanner.nextInt();
				
			}

		}
		for(int row=0;row<rows;row++) {
			for(int col=0;col<cols;col++) {
				System.out.print(matrix[row][col]+"\t");
			}
			System.out.println("");
		}
		
	}

}
