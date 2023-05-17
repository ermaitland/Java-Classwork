import java.util.Random;
import java.util.Scanner;

public class PracticeLuckySevens {
static int dollars;
static int highestDollars;
static int rolls=0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many dollars do you have to bet?");
		dollars=scanner.nextInt();
		play();
	}
public static void play() {
	int i;
	Random rng=new Random();
	highestDollars=dollars;
	for(i=0;i<dollars;) {
		    rolls++;
			int dice1=rng.nextInt(8);
			int dice2=rng.nextInt(8);
			int total=dice1+dice2;
			if(total==7) {
				dollars=dollars+4;
				if(dollars>highestDollars) {
					highestDollars=dollars;
				}
			}else {
				dollars--;
			}
	}
	System.out.println("You ran out of money after "+rolls+" games");
	System.out.println("The highest number of dollars you had was $"+highestDollars);
}
}
