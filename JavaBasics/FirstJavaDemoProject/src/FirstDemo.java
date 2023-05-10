
public class FirstDemo {

	public static void main(String[] args) {
		/* 
		 * Any programming language have: 
		 * 1) Keywords: Java Reserve words
		 * 2) Identifiers: Names used to identify class, method, variable etc
		 * 3) Literal: Any constant values 
		 */
		
//		int value;
//		value = 34;

		int value=34;
		double value2=23.4;
//		For long need so have "l" or "L" to let the program know
//		long value3=56l;
		long value4=56L;
		
//		For float need to have "f" or "F" to let the program know
//		float value5=34.3f;
		float value6=34.3F;
		
		boolean value7=true;
		
//		For character has to be in single quotes:
		char value8='A';
		
//		String in double quotes;
		String value9= "Hello Everyone";
		
		System.out.println("Value : "+value );
		System.out.println("Value 2 : "+value2);
		System.out.println("Value 4 : "+ value4);
		System.out.println("Value 6 : "+ value6);
		System.out.println("Value 7 : "+ value7);
		System.out.println("Value 8 : "+ value8);
		System.out.println(value9);
	}

}
