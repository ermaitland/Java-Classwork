import java.util.Scanner;

//Class Assignment
//Write a Program to display the following menu and program should perform as per the menu option selected by the user.
//1. Calculate Area of Rectangle
//2. Calculate Area of Circle
//3. Calculate Area of Triangle
//4. Calculate Area of Square
public class SecondPracticeQuestion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int actionToTake, height, width, radius, base, length;
		double area;
		float pi = 3.142f;
		
		System.out.println("Enter: 1 to Calculate Area of Rectangle \nEnter: 2 to Calculate Area of Circle \nEnter: 3 to Calculate Area of Triangle \nEnter: 4 to Calculate Area of Square");
		actionToTake=scanner.nextInt();		
		
		switch(actionToTake) {
		case 1:
			System.out.println("Enter the height of the rectangle : ");
			height=scanner.nextInt();
			System.out.println("Enter the width of the rectangle : ");
			width=scanner.nextInt();
			area = height*width;
			System.out.println("The area of the rectangle is : "+area);
			break;
		case 2:
			System.out.println("Enter the radius of the circle : ");
			radius=scanner.nextInt();
			area=pi*radius*radius;
			System.out.println("Area of the circle is : "+area);
			break;
		case 3:
			System.out.println("Enter the height of the triangle : ");
			height=scanner.nextInt();
			System.out.println("Enter the base of the triangle : ");
			base=scanner.nextInt();
			area=(base*height)/2;
			System.out.println("The area of the triangle is : "+area);
			break;
		case 4:
			System.out.println("Enter the length of a side of the square : ");
			length=scanner.nextInt();
			area=length*length;
			System.out.println("The area of the square is : "+area);
			break;
		default:
			System.out.println("That is not a valid option");
		}

	}

}
