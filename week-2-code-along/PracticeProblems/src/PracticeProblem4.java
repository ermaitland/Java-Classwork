import java.util.Scanner;

public class PracticeProblem4 {

	public static void main(String[] args) {
		
//	******* Llamas Whales and Dodos Oh My ******************
		
//		int llamas = 200;
//		int whales = 15;
//		int dodos = 0;
//		
//		if(dodos > 0)
//			System.out.println("Egads, I thought dodos were extinct!");
//		
//		if(dodos < 0)
//			System.out.println("Hold on, how can we have NEGATIVE dodos?");
//		
//		if(llamas > whales)
//            System.out.println("Whales may be bigger, but llamas are better, ha!");
//        
//
//        if(llamas <= whales)
//            System.out.println("Aw man, brawn over brains I guess. Whales beat llamas.");
//        
//
//        System.out.println("There's been a huge increase in the dodo population via cloning!");
//        dodos += 100;
//
//        if( (whales + llamas) < dodos)
//            System.out.println("I never thought I'd see the day when dodos ruled the earth.");
//        
//
//        if(llamas > whales && llamas > dodos)
//            System.out.println("I don't know how, but the llamas have come out ahead! Sneaky!");
        

//	********************** Guess Me **************************
		
//		Scanner scanner=new Scanner(System.in);
//		
//		int numberToGuess = 24;
//		int userNum;
//		
//		System.out.println("Please pick a number :");
//		userNum=scanner.nextInt();
//		
//		if(numberToGuess == userNum)
//			System.out.println("Wow thats correct - well done!");
//		else if(numberToGuess > userNum)
//			System.out.println("Unlucky, you chose "+userNum+" which is too low. The number was "+numberToGuess);
//		else
//			System.out.println("Unlucky, you chose "+userNum+" which is too high. The number was "+numberToGuess);
	
// ************* Your life in movies *****************************
		
//		Scanner scanner=new Scanner(System.in);
//		String name;
//		int yearBorn;
//		
//		System.out.println("Hey, lets play a game! What is your name?");
//		name=scanner.next();
//		
//		System.out.println("Hi there "+name+", what year were you born?");
//		yearBorn=scanner.nextInt();
//		
//		if(yearBorn < 2005)
//			System.out.println("Did you know Pixar's 'Up' came out over a decade ago.");
//		if(yearBorn < 1995)
//			System.out.println("And the first Harry Potter came out over 15 years ago.");
//		if(yearBorn < 1985)
//			System.out.println("And Space Jam came out not last decade, but the one before THAT.");
//		if(yearBorn < 1975)
//			System.out.println("And the original Jurassic Park release is closer to the first lunar landing than it is to today");
//		if(yearBorn < 1965)
//			System.out.println("And the MASH TV series has been around for almost half a century!");
	
	
//	**************** Space Rustlers ***********************************
		
//        int spaceships = 10;
//        int aliens = 25;
//        int cows = 100;
//
//        if(aliens > spaceships){
//            System.out.println("Vrroom, vroom! Let's get going!");
//        } else{
//            System.out.println("There aren't enough green guys to drive these ships!");
//        }
//
//        if(cows == spaceships){
//            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
//        } else if (cows > spaceships){
//            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
//        } else {
//            System.out.println("Too many ships! Not enough cows.");
//        }
//		
//		 if(aliens>cows)
//			 System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
//		 else
//			 System.out.println("Oh no! The herds got restless and took over! Looks like we're hamburger now!!");
		
//		An if else statement allows the program to perform one action id the condition is met and another is it 
//		is not - it does this without having to consider other conditions.
		
//	********************** BirthStone **************************************
		
//		int monthNum;
//		Scanner scanner=new Scanner(System.in);
//		
//		System.out.println("What Months Birthstone do you want to know?\n1 is Jan, 2 is Feb etc..");
//		monthNum=scanner.nextInt();
//		
//		switch(monthNum) {
//		case 1:
//			System.out.println("Janurary's birth stone is Garnet");
//			break;
//		case 2:
//			System.out.println("Feburary's birth stone is Amethyst");
//			break;
//		case 3:
//			System.out.println("March's birth stone is Aquamarine");
//			break;
//		case 4:
//			System.out.println("April's birth stone is Diamond");
//			break;
//		case 5:
//			System.out.println("May's birth stone is Emerald");
//			break;
//		case 6:
//			System.out.println("June's birth stone is Pearl");
//			break;
//		case 7:
//			System.out.println("July's birth stone is Ruby");
//			break;
//		case 8:
//			System.out.println("August's birth stone is Peridot");
//			break;
//		case 9:
//			System.out.println("September's birth stone is Sapphire");
//			break;
//		case 10:
//			System.out.println("October's birth stone is Opal");
//			break;
//		case 11:
//			System.out.println("November's birth stone is Topaz");
//			break;
//		case 12:
//			System.out.println("December's birth stone is Turpuise");
//			break;
//		default:
//			System.out.println("Sorry that is not a valid month number. The number must be in the range 1-12");
//		}
		

//	************* Trivia Night ***************************
//		Scanner scanner=new Scanner(System.in);
//		
//		int ans1, ans2, ans3, ans4;
//		int score=0;
//		
//		System.out.println("What coding language is this quiz written in?\n1) Java\n2) JavaScript\n3) C++\n4) Python");
//		ans1=scanner.nextInt();
//		
//		if(ans1 == 1) {
//			++score;
//			System.out.println("Correct, well done - you score is "+score);
//		}else {
//			System.out.println("Unlucky, the answer was 1) Java. Your score is "+score);
//		}
//		
//		System.out.println("What is the larges mammal?\n1) Horse\n2) Elephant\n3) Blue Whale\n4) Eagle");
//		ans1=scanner.nextInt();
//		
//		if(ans1 == 3) {
//			++score;
//			System.out.println("Correct, well done - you score is "+score);
//		}else {
//			System.out.println("Unlucky, the answer was 3) Blue Whale. Your score is "+score);
//		}
//		
//		System.out.println("What is the capital of England?\n1) Oxford\n2) London\n3) Birmingham+\n4) Bristol");
//		ans1=scanner.nextInt();
//		
//		if(ans1 == 2) {
//			++score;
//			System.out.println("Correct, well done - you score is "+score);
//		}else {
//			System.out.println("Unlucky, the answer was 2) London. Your score is "+score);
//		}
//		
//		System.out.println("What sandwiches paddington bear famously eat?\n1) Marmite\n2) PB&J\n3) Hummus\n4) Marmalade");
//		ans1=scanner.nextInt();
//		
//		if(ans1 == 4) {
//			++score;
//			System.out.println("Correct, well done - you score is "+score);
//		}else {
//			System.out.println("Unlucky, the answer was 4) Marmalade. Your score is "+score);
//		}
//		
//		float percent;
//		percent = (float)(score*100)/4;
//		System.out.println(percent);
//		System.out.println("Congrats, you completed the quiz. You got a final score of "+score+"/4. Fantastic work - thats "+percent+"%!");
	
		
//  **********8 KNockKnock *********************************
		
//        Scanner inputReader = new Scanner(System.in);
//
//        System.out.print("Knock Knock! Guess who!! ");
//        String nameGuess = inputReader.nextLine();
//
//        if(nameGuess.equals("Marty McFly")){
//            System.out.println("Hey! That's right! I'm back!");
//            System.out.println(".... from the Future."); // Sorry, had to!
//        }else{
//            System.out.println("Dude, do I -look- like " + nameGuess);
//        }
		
//		Because you are comparing Strings, you need to use the .equals NOT ==. It wont work with the ==
//		If you want it to work even with wrong capitalisation you need .equalsIgnoreCase
		
//	********** Picky Eater ******************************
//        Scanner userInput = new Scanner(System.in);
//
//        System.out.print("How many times has it been fried? (#) ");
//        int timesFried = Integer.parseInt(userInput.nextLine());
//
//        System.out.print("Does it have any spinach in it? (y/n) ");
//        String hasSpinach = userInput.nextLine();
//
//        System.out.print("Is it covered in cheese? (y/n) ");
//        String cheeseCovered = userInput.nextLine();
//
//        System.out.print("How many pats of butter are on top? (#) ");
//        int butterPats = Integer.parseInt(userInput.nextLine());
//
//        System.out.print("Is it covered in chocolate? (y/n) ");
//        String chocolatedCovered = userInput.nextLine();
//
//        System.out.print("Does it have a funny name? (y/n) ");
//        String funnyName = userInput.nextLine();
//
//        System.out.print("Is it broccoli? (y/n) ");
//        String isBroccoli = userInput.nextLine();
//
//        if (hasSpinach.equals("y") || funnyName.equals("y")) {
//            System.out.println("There's no way he'll eat that!");
//        }else if(timesFried >2 && timesFried <4 && chocolatedCovered.equalsIgnoreCase("y")) {
//        	System.out.println("Oh, it's like a deep-fried Snickers. That'll be a hit!");
//        }else if(timesFried == 2 && cheeseCovered.equalsIgnoreCase("y")) {
//        	System.out.println("Mmm. Yeah, he'll each fried cheesy doodles.");
//        }else if(isBroccoli.equalsIgnoreCase("y") && butterPats >6 && cheeseCovered.equalsIgnoreCase("y")) {
//			System.out.println("As long as the green is hidden by cheddar, it'll happen!");
//		}else if(isBroccoli.equalsIgnoreCase("y")) {
//			System.out.println("Oh, green stuff like that might as well go in the bin");
//		}
//	***** Field Day ******************************8
		
//		TO DO?!
		
//	********* MiniZork *****************************8
		
        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
            	System.out.println("You find a letter with blood on it");
            	System.out.println("Do you want to throw it away or read it?");
            	action=userInput.nextLine();
            	
            	if(action.equals("throw it away")) {
            		System.out.println("You've angered the gods.... you've been teleported to an acient castle");
            		System.out.println("Do you want to enter the castle or fly on a dragon?");
            		action=userInput.nextLine();
            		
            		if(action.equals("enter the castle"))
            			System.out.println("Its a door back to Brixton! You're safe!");
            		else if(action.equals("fly on a dragon"))
            			System.out.println("Oh no! You have no training for that..... you've fallen off and died!@");
            	}else if(action.equals("read it"))
            		System.out.println("The letter is warning you of a demigod out to kill you all....");
            }
        } else if (action.equals("go to the house")) { 
        	System.out.println("You've been killed");
        }
	}

}
