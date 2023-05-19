
public class Factorial {
private int number, factorial;


public void setNumber(int number) {
	this.number = number;
}

public int getFactorial() {
	calculateFactorial();
	return factorial;
}

private void calculateFactorial() {
	int i;
	factorial=number;
	for(i=number-1;i>0;i--) {
		factorial*=i;
	}
}

}
