package com.ellie.demo;

public class MyFirstStaticMain {

	public static void main(String[] args) {
		//Can access static variables before creating obj... 
		
		System.out.println(MyFirstStaticVariableDemo.value2); //goes from 0
		MyFirstStaticVariableDemo.value2=20;
		System.out.println(MyFirstStaticVariableDemo.value2); // to 20
		
//		MyFirstStaticVariableDemo obj=new MyFirstStaticVariableDemo();
		

	}

}
