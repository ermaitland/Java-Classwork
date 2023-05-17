
public class PerfectSquareDemo {

	static int evenPerfectSquaresNumbers;
	
	public static void main(String[] args) {
		int i =100;
		// System is a class - got a capital letter, Pascel case.
		
		
		System.out.println("Total perfect squares : "+calculateCount(i));
		System.out.println("Even perfect squares : "+evenPerfectSquaresNumbers);

	}
	
public static int calculateCount(int i) {
	int perfectSquaresCount=0;

	for(int number=1;number<i;number++) {
		if(isPerfectSquare(number)) {
			perfectSquaresCount++;
			if(number%2==0) {
				evenPerfectSquaresNumbers++;
			}
		}
	}
	
	return perfectSquaresCount;
}
	
	
public static boolean isPerfectSquare(int number) {
	double sqrt=Math.sqrt(number);
	return sqrt-Math.floor(sqrt)==0; //floor is rounding down
}
}
