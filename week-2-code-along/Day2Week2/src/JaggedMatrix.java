import java.util.Scanner;

public class JaggedMatrix {

	public static void main(String[] args) {
		int arr[][];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows=sc.nextInt();
		
		arr=new int[rows][]; // memory area for rows
		
		for(int row=0;row<rows;row++) {
			// enter number of columns
			System.out.println("Enter number of cols for row "+(row+1));
			int cols=sc.nextInt();
			//assign memory for cols
			arr[row]=new int[cols];
			for (int col=0;col<cols;col++) {
				// enter the values for the elements in that row
				System.out.println("Wnter element at ["+row+"]["+col+"] location : ");
				arr[row][col]=sc.nextInt();
			}
		}
		
		for(int row=0;row<rows;row++) {
			//display - use the arr[row].length as cannot access the columns
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+"\t");
			}
			System.out.println("");
		}

	}

}
