import java.util.Scanner;

public class ArrayQuestion3 {

	public static void main(String[] args) {
		// create size of matrix
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number of rows in matrix:");
	int rows=scanner.nextInt();	
	System.out.println("Enter number of columns in matrix :");
	int cols=scanner.nextInt();
	
		// create two matrix
	int arrayOne[][]=createArray("1st Matrix",rows,cols);
    int arrayTwo[][]=createArray("2nd Matrix",rows,cols);
    
    	// display two matrix
    System.out.println("The first matrix:");
    displayMatrix(arrayOne, rows, cols);
    System.out.println("The second matrix:");
    displayMatrix(arrayOne, rows, cols);
    
	    // add both matrix
    int totalValue[][]=additionOfMatrix(arrayOne, arrayTwo, rows,cols);
    System.out.println("The total of both matrices is :");
    
    	// display total matrix
    displayMatrix(totalValue, rows,cols);   
	}

public static int[][] createArray(String arrayName, int rows, int cols) {
	// input values into matrix
	int arrayMatrix[][]; 
	Scanner scanner=new Scanner(System.in);
	arrayMatrix=new int[rows][cols]; // memory area
	for(int row=0;row<rows;row++) {
		for(int col=0;col<cols;col++) {
			System.out.println("Enter element at location :["+row+"]["+col+"] in "+arrayName);
			arrayMatrix[row][col]=scanner.nextInt();
		}
    }
	return arrayMatrix;
}

public static void displayMatrix(int[][] array, int rows, int cols) {
	// display the matrix
    for(int row=0;row<rows;row++) {
    	for(int col=0;col<cols;col++) {
    		System.out.print(array[row][col]+"\t");
    	}
    	System.out.println("");
    }
}

public static int[][] additionOfMatrix(int[][] array1, int[][] array2, int rows, int cols) {
	// add the matrix together
	int[][] array3;
	array3=new int[rows][cols];
	for(int row=0;row<rows;row++) {
		for(int col=0;col<cols;col++) {
			array3[row][col] = array1[row][col] + array2[row][col];
		}
	}
	return array3;
}
}