import java.awt.SystemColor;
import java.util.Scanner;

public class PracticeThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//        String name;
//        String quest;
//        double velocityOfSuperman;

        // We can use the Scanner's readLine to assign value to our strings
        // because its return type is string
//        System.out.println("What is your name?? ");
//        name = scanner.nextLine();
//
//        System.out.println("What is your quest?! ");
//        quest = scanner.nextLine();

        // When we get to our double data type, we can use Scanner's nextDouble method
        // or we can use the Double.parseDouble to convert the nextLine's String
//
//        System.out.println("What is the airspeed velocity of Superman?!?! ");
//        velocityOfSuperman = Double.parseDouble(scanner.nextLine());
//        System.out.println();
//        System.out.println("How do you know " + velocityOfSuperman + " is correct, " + name + "?");
//        System.out.println("You didn't even know where Superman lives!");
//        System.out.println("Maybe skip answering things about Super-hero's and instead go " + quest + ".");

        
//		***** Meaning of life **********
//
//        int meaningOfLifeAndEverything = 42;
//        double pi = 3.14159;
//        String cheese, color;
//
//        System.out.println("Give me pi to at least 5 decimals: ");
//        Double.parseDouble(scanner.nextLine());


//        System.out.println("What is the meaning of life, the universe & everything? ");
//        Integer.parseInt(scanner.nextLine());
//
//        System.out.println("What is your favorite kind of cheese? ");
//        cheese=scanner.next();
//
//        System.out.println("Do you like the color red or blue more? ");
//        color=scanner.next();
//
//        System.out.println("Ooh, " + color + " " + cheese +" sounds delicious!");
//        System.out.println("The circumference of life is " +( 2 * pi * meaningOfLifeAndEverything));
        
        
        /*Ask the user for their name.
Display that name and tell them yours (or your AI's name!).
Ask them for their favorite color.
Display the color they enter in a conversational way.
Do the same thing with favorite food and number, and then say goodbye!
Make sure you use the right variable with the right user input!
         */
//		String name, mood, color, food;
//		int number;
//		
//		System.out.println("Hi there, what is your name?");
//		name=scanner.next();
//		
//		System.out.println("Hi there "+name+".");
//		System.out.println("My name is A.I.lice. How are you today?");
//		mood=scanner.next();
//		
//		System.out.println("I am often "+mood+", it always makes me think of the colour pink. Whats your favorite color?");
//		color=scanner.next();
//		
//		System.out.println("What a lovely colour! How about number? Do you have a favorite one of those too?");
//		number=scanner.nextInt();
//		
//		System.out.println("Fun! I like 13. I also love pizza... nom nom! Whats your favorite snack food?");
//		food=scanner.next();
//		
//		System.out.println("Oooooooo, making me hungry. I think I'm going to have to go now and get some food... speak soon!");
//		
//		***** BOASTING **********
		
//		int miles, eat, language;
//		int myMiles, myEat, myLanguage;
//		
//		System.out.println("How many miles can you run ? ");
//		miles=scanner.nextInt();
//		myMiles=(miles*2)+1;
//		System.out.println("Well I can run "+myMiles+" miles! Ha!");
//		
//		System.out.println("How many hot dogs can you eat ? ");
//		eat=scanner.nextInt();
//		myEat=(eat*2)+1;
//		System.out.println("Well I can eat "+myEat+" hot dogs! Ha!");
//		
//		System.out.println("How many languages can you speak ? ");
//		language=scanner.nextInt();
//		myLanguage=(language*2)+1;
//		System.out.println("Well I can speak "+myLanguage+" languages! Ha!");
		
//		***** Heart Rate **********
		
//		int age, maxHeartRate;
//		double lowerZone, upperZone;
//		System.out.println("What is your age ? ");
//		age=scanner.nextInt();
//		maxHeartRate=220-age;
//		lowerZone=maxHeartRate*0.5;
//		upperZone=maxHeartRate*0.85;
//		System.out.println("You max heart rate is "+maxHeartRate);
//		System.out.println("You ideal heart range is between "+lowerZone+"-"+upperZone+" beats.");
//	
//		****** Mini Mad Lips ********** 

		
		String noun1, noun2, adjective1, adjective2, pluralNoun1, pluralNoun2, pluralNoun3, presentVerb, verbInPast;
		int number;
		
		System.out.println("Please enter a noun : ");
		noun1=scanner.next();
		
		System.out.println("Please enter another noun : ");
		noun2=scanner.next();
		
		System.out.println("Please enter another number : ");
		number=scanner.nextInt();
		
		System.out.println("Please enter an adjective : ");
		adjective1=scanner.next();
		
		System.out.println("Please enter another adjective : ");
		adjective2=scanner.next();
		
		System.out.println("Please enter a plural noun : ");
		pluralNoun1=scanner.next();
		
		System.out.println("Please enter another plural noun : ");
		pluralNoun2=scanner.next();
		
		System.out.println("Please enter another plural noun : ");
		pluralNoun3=scanner.next();
		
		System.out.println("Please enter a present verb : ");
		presentVerb=scanner.next();
		
		System.out.println("Please enter the same verb in past tense : ");
		verbInPast=scanner.next();
		
		System.out.println(noun1+" : the "+adjective1+" frontier. These are the voyages of the starship "+noun2+". Its "+number+" -year mission: to explore strange "+adjective2+" "+pluralNoun1+", to seek out "+adjective2+" "+pluralNoun2+" and "+adjective2+" "+pluralNoun3+", to boldly "+presentVerb+" where no one has "+verbInPast+" before.");
		
		
	}

}
