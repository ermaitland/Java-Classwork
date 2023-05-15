
public class PracticeTwo {

	public static void main(String[] args) {
		String walrus;
		int age;
		float height;
		
		walrus="Hi there I am called Mr. Walrus";
		age=10;
		height=5.4f;
		
		System.out.println(walrus);
		System.out.println("Mr. Walrus' age is : "+age);
		System.out.println("Mr. Walrus' height is : "+height+"m");
		
		int bugs, butterflies, dogs, beetles;
		
		beetles = 8;
		butterflies=5;
		bugs=beetles+butterflies;
		dogs=1;
		
		System.out.println("There are "+butterflies+" butterflies and "+beetles+" beetles.");
		System.out.println("That makes "+bugs+ " bugs all together");
		beetles--;
		System.out.println("Oh no! The "+dogs+" dog ate a beetle. Now there are only "+bugs+" bugs left.");
		
		 double number;
	        String opinion, size, age2, shape, color, origin, material, purpose;
	        String noun;

	        number = 7.0;
	        opinion = "average";
	        size = "huge";
	        age2 = "very old";
	        shape = "square";
	        color = "purple";
	        origin = "Earthling";
	        material = "Cardboard";
	        purpose = "eating";

	        noun = "headgehogs";

	        // Using the + with strings doesn't add -- it concatenates! (sticks them together)
	        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape
	                 + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
	        
	     String food1,food2,food3;
	     float price1, price2, price3;
	     
	     food1="Peperoni Pizza";
	     food2="Red Cabbage";
	     food3="Onions with garlic sauce";
	     price1=1.25f;
	     price2=6.70f;
	     price3=5.25f;
	     
	        
	     System.out.println("\n.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.");
	     System.out.println("\nWELCOME TO THE RESTURANT WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOP!");
	     System.out.println("\n.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.");
	     System.out.println("\nAt £"+price3+" We have "+food2+"!");
	     System.out.println("\nAt £"+price1+" We have "+food3+"!");
	     System.out.println("\nAt £"+price2+" We have "+food1+"!");
	}

}
