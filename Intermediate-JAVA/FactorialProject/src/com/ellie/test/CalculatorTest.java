package com.ellie.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ellie.demo.Calculator;
import com.ellie.exceptions.NegativeNumberException;

class CalculatorTest {

//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//		System.out.println("Set up before class");
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//		System.out.println("Tear down after class");
//	}

	// Reference Variable : null;
	private Calculator calculator;
	
	
	@BeforeEach
	void setUp() throws Exception {
		// Created the Object, now reference variable points to the object on heap. This happens before each test
		calculator=new Calculator();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		// After each test it gets removed from memory, back to null; just like in the reference variable
		calculator=null;
	}

	@Test
	void testDivideR001_T001() throws NegativeNumberException {
		// assert = what you expect and the function call you need to do
		assertEquals(6, calculator.divide(12,2));
	}
	
	@Test
	void testDivideR001_T002() throws NegativeNumberException {
		assertEquals(0, calculator.divide(0,5));
	}
	@Test
	void testDivideR001_T003() throws NegativeNumberException {
		assertThrows(NegativeNumberException.class, ()->calculator.divide(12,-2));
	}
	@Test
	void testDivideR001_T004() throws NegativeNumberException {
		assertThrows(NegativeNumberException.class, ()->calculator.divide(-12,2));
	}
	@Test
	void testDivideR001_T005() throws NegativeNumberException {
		assertThrows(NegativeNumberException.class, ()->calculator.divide(-12,-2));
	}
	@Test
	void testDivideR001_T006() throws NegativeNumberException {
		assertThrows(ArithmeticException.class, ()->calculator.divide(12,0));
	}

}
