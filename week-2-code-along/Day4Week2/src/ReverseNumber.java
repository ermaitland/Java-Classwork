// When deciding class - first how many variables needed. e.g. this one need an input number and then an output = 2; Usually keep these 
// as private 
/*
 * Once decided, decide which is supposed to be modified and which readable (means only read it not change it)
 * Usually output = readable and input = modifiable
 * For all the modifiable variables, create setter methods
 * For all the readable variables create getter
 * --- giving all the thought to the data ----- reduces accidental corruption of data
 * For all the modifiable and readable variables create both setter and getter methods
 */
public class ReverseNumber {

	/*
	 * number: modifiable : setter method
	 * reverse: readable : getter method
	 */
	
	private int number, reverse;


	public void setNumber(int number) {
		this.number = number;
	}

	public int getReverse() {
		calculateReverse();
		return reverse;
	}

	private void calculateReverse() {
		while(number>0) {
			reverse=reverse*10+number%10;
			number=number/10;
		}
	}
	
	
	
}
