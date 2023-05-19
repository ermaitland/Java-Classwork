package com.maitland.demo;

import java.util.Scanner;

public class MainComplexNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ComplexNumber complexNumber1; /* declaration -
		 at this point reference variable - initially stored as null because no value has been assigned
		 
		*/
		complexNumber1=new ComplexNumber(); /* memory allocation - 
		default initial value, memory allocated in heap- if it were a boolean = false, number = 0; double = 0.0, string=null;
		*/
		System.out.println("Enter real for first complex number");
		int real=scanner.nextInt();
		System.out.println("Enter imaginary for second complex number");
		int imaginary=scanner.nextInt();
		complexNumber1.inputComplexNumber(real,imaginary);
		complexNumber1.displayComplexNumber();
		ComplexNumber complexNumber2=new ComplexNumber();
		complexNumber2.inputComplexNumber(3,6);
		complexNumber2.displayComplexNumber();
		ComplexNumber complexNumber3=new ComplexNumber();
		complexNumber3.complexSum(complexNumber1, complexNumber2);
		complexNumber3.displayComplexNumber();
		
	}

}
// You can create a data type to express imaginary data type - not a specific data type.