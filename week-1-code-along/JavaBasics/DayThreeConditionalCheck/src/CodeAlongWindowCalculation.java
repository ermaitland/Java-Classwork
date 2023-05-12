import java.util.Scanner;

/*
It must prompt the user for the height of the window (in feet).
It must prompt the user for the width of the window (in feet).
It must calculate and display the area of the window.
It must calculate and display the perimeter of the window.
Based on the area and perimeter, it must calculate the total cost of the window.
The glass for the windows cost $3.50 per square foot.
The trim for the windows cost $2.25 per linear foot.
 * */
public class CodeAlongWindowCalculation {

	public static void main(String[] args) {
		int heightFeet, widthFeet, area, perimeter;
		double totalCost;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter the height of the window in feet : ");
		heightFeet=scanner.nextInt();
		
		System.out.println("Please enter the width of the window in feet : ");
		widthFeet=scanner.nextInt();
		
		area=heightFeet*widthFeet;
		System.out.println("The area of the window is : "+area);
		
		perimeter=(heightFeet*2)+(widthFeet*2);
		System.out.println("The perimeter of the window is : "+perimeter);
		
		totalCost=(3.50*area)+(2.25*perimeter);
		System.out.println("The total cost of the window will be : $"+totalCost);

	}

}


/*The model answer they give: 
 * public static void main(String [] args) {
    // declare variables for height and width
    float height;
    float width;

    // declare String variables to hold the user's height and
    // width input
    String stringHeight;
    String stringWidth;

    // declare other variables
    float areaOfWindow;
    float cost;
    float perimeterOfWindow;

    // declare and initialize the Scanner
    Scanner myScanner = new Scanner(System.in);

    // get input from the user
    System.out.println("Please enter window height:");
    stringHeight = myScanner.nextLine();
    System.out.println("Please enter window width:");
    stringWidth = myScanner.nextLine();

    // convert String values of height and width to float values
    height = Float.parseFloat(stringHeight);
    width = Float.parseFloat(stringWidth);

    // calculate the area of the window
    areaOfWindow = height * width;

    // calculate the perimeter of the window
    perimeterOfWindow = 2 * (height + width);

    // calculate the total cost - use a hard-coded value
    // for material cost
    cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

    // display the results to the user
    System.out.println("Window height = " + stringHeight);
    System.out.println("Window width = " + stringWidth);
    System.out.println("Window area = " + areaOfWindow);
    System.out.println("Window perimeter = " + perimeterOfWindow);
    System.out.println("Total Cost =  " + cost);
}
 */
*/