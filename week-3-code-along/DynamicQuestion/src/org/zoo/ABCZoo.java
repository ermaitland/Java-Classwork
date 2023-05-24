package org.zoo;
import org.animal.*;

public class ABCZoo {

	public static void main(String[] args) {
		Lion lion=new Lion("Orange",60, 7);
		Snake snake=new Snake("Green", 2, 1);
		Elephant elephant=new Elephant("Grey", 300, 6);
		Frog frog=new Frog("Green",1,1);
		Tiger tiger=new Tiger("Yellow and Black", 60, 2);
		
		System.out.println("The zoo has a lion who is "+lion.getColor()+" and weighs "+lion.getWeight()+"kg. He is "+lion.getAge()+" years old. Vegitarian : "+lion.isVegetarian()+". Climbs : "+lion.isClimb()+".");
		System.out.println("The zoo has a snake who is "+snake.getColor()+" and weighs "+snake.getWeight()+"kg. She is "+snake.getAge()+" years old. Vegitarian : "+snake.isVegetarian()+". Climbs : "+snake.isClimb()+".");
		System.out.println("The zoo has an elephant who is "+elephant.getColor()+" and weighs "+elephant.getWeight()+"kg. She is "+elephant.getAge()+" years old. Vegitarian : "+elephant.isVegetarian()+". Climbs : "+elephant.isClimb()+".");
		System.out.println("The zoo has a frog who is "+frog.getColor()+" and weighs "+frog.getWeight()+"kg. He is "+frog.getAge()+" years old. Vegitarian : "+frog.isVegetarian()+". Climbs : "+frog.isClimb()+".");
		System.out.println("The zoo has a tiger who is "+tiger.getColor()+" and weighs "+tiger.getWeight()+"kg. He is "+tiger.getAge()+" years old. Vegitarian : "+tiger.isVegetarian()+". Climbs : "+tiger.isClimb()+".");
		
	}

}
