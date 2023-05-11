import java.util.Scanner;


// area = pi * r^2 --- c = 2*pi*r
public class FirstExersiceOnUserInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		float pi = 3.142F;
		
		System.out.println("Please Enter the Radius of the circle : ");
		float radius=scanner.nextFloat();
		
		double area = (pi*radius*radius);
		double c = (2*pi*radius);
		
		System.out.println("The area of the circle is : "+area);
		
		System.out.println("The circumference of the circle is : "+c);

	}

}
