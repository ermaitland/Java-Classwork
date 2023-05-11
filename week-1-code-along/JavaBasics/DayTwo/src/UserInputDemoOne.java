import java.util.Scanner;

// Area of Rectangle = lengthOfRectangle * widthOfRectangle
public class UserInputDemoOne {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter the length of the Rectangle : ");
		int length=scanner.nextInt();
		
		System.out.println("Enter the width of the Rectangle : ");
		int width=scanner.nextInt();
		
		int area=length*width;
		
		System.out.println("Area of Rectangle : "+area);

	}

}
