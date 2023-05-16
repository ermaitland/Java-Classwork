import java.util.Random;

public class PracticeProblem8 {

	public static void main(String[] args) {
//        eatMe();
//        drinkMe();
//        System.out.println("\n ― Lewis Carroll, Alice in Wonderland");
//    }
//
//    static void eatMe(){
//        System.out.println(" 'But I don’t want to go among mad people,' Alice remarked.");
//        System.out.println(" 'Oh, you can’t help that,' said the Cat.");
//        System.out.print(" 'We’re all mad here. I’m mad. You’re mad.'");
//    }
//
//    static void drinkMe(){
//        System.out.println(" 'How do you know I’m mad?' said Alice.");
//        System.out.println(" 'You must be,' said the Cat, 'or you wouldn’t have come here.' ");

		
// ******** Method to Madness *********************************
		
//		char aMystery = mystery();
//        String totallyUnexpected = unexpected();
//        double aSurprise = surprise();
//        boolean itsClassified = classified();
//        int aSecret = secret();
//
//        System.out.println("The methods have returned! Their results...\n");
//        System.out.println("Mysterious: " + aMystery);
//        System.out.println("    Secret: " + aSecret);
//        System.out.println("Surprising: " + aSurprise);
//        System.out.println("Classified: " + itsClassified);
//        System.out.println("Unexpected: " + totallyUnexpected);
//
//    }
//
//    public static int secret(){
//        return 42;
//    }
//
//    public static double surprise(){
//        return 3.14;
//    }
//
//    public static char mystery(){
//        return 'X';
//    }
//
//    public static boolean classified(){
//        return true;
//    }
//
//    public static String unexpected(){
//        return "Spanish Inquisition";
	
	
//	*************** Match work **************************
		
//        System.out.println(" The word Cart should come before Horse alphabetically : " + comesBefore("Cart","Horse"));
//        System.out.println(" Half of 42 = " + halfOf(42));
//        System.out.println(" (short) Pi = " + pi());
//        System.out.println(" The first letter of the word Llama is: " + firstLetter("Llama"));
//        System.out.println(" 1337 x 1337 = " + times1337(1337));
//
//    }
//
//    public static double pi(){
//        return 3.14;
//    }
//
//    public static int times1337(int x){
//        return x * 1337;
//    }
//
//    public static double halfOf(double y){
//        return y / 2;
//    }
//
//    public static String firstLetter(String word){
//        return word.substring(0, 1);
//    }
//
//    public static boolean comesBefore(String a, String b){
//        return a.compareToIgnoreCase(b) < 0;
	
	
//	**************** Barely controlled chaos **************************** 
		
		String color = word("Green"); // call color method here
        String animal = word("Tiger"); // call animal method again here
        String colorAgain = word("red"); // call color method again here
        int weight = number(5,200); 
        int distance = number(10,20);
        int number = number(10000,20000); 
        int time = number(2,6); 
        

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    public static String word(String word) {
    	return word;
    }
    public static int number(int rangeLower, int rangeHigher) {
    	Random rng = new Random();
    	int desiredOutput = rng.nextInt() * (rangeHigher - rangeLower);
    	return desiredOutput;
    }
		
	}

	


