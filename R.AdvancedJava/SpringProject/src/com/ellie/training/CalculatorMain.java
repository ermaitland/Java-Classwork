package com.ellie.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ellie.demo.*;

public class CalculatorMain {

	public static void main(String[] args) {
		
		//ApplicationContext read Calculator.xml and create object for all the classes mentioned
		// in the <bean> tag and give each object the name mentioned in id attribute of <bean> tag.
		
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("Calculator.xml");
		Operator operator1=(Operator)springContainer.getBean("add");
		System.out.println("Result : "+operator1.operate(2,3)); 
		
		Operator operator2=(Operator)springContainer.getBean("multiply");
		System.out.println("Result : "+operator2.operate(2,3)); 
		
		Operator operator3=(Operator)springContainer.getBean("subtract");
		System.out.println("Result : "+operator3.operate(2,3)); 
		
		Calculator1 calculator=(Calculator1)springContainer.getBean("sumCalc");
		calculator.showResult(3, 4);
		
//		Calculator calculator=new Calculator();
//		calculator.showResult(10, 20);

	}

}
