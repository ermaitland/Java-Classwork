package com.maitland.demo;
// if class with private properties and public setters and getters:
//POJO: Plain old Java Object or called Java Beans
public class ComplexNumber {

	private int real, imaginary;

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	
	public void inputComplexNumber(int real, int imaginary) {
		this.real=real; 
		/*
		 * this. is a reference variable which holds the address of the current variable being used
		 * initialise instance variables with the value of local variables
		 */
		this.imaginary=imaginary;
	}
	public void displayComplexNumber() {
		System.out.print(real);
		if(imaginary>0) {
			System.out.println("+"+imaginary+"i");
		}else if(imaginary<0) {
			System.out.println(imaginary+"i");
		}
	}
	public void complexSum(ComplexNumber c1, ComplexNumber c2) {
		this.real=c1.real+c2.real;
		this.imaginary=c2.imaginary+c2.imaginary;
	}
	
}
