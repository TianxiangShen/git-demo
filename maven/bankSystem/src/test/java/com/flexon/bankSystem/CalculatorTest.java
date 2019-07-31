package com.flexon.bankSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	// sum
	@Test
	public void testSum() {
		System.out.println("Sum test");
		Integer x = 15;
		Integer y = 15;
		Integer expResult = 30;
		Integer result = Calculator.sum(x, y);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testSumNull() {
		System.out.println("Sum test Null part");
		assertEquals(null, Calculator.sum(15, null));
		assertEquals(null, Calculator.sum(null, 15));
		assertEquals(null, Calculator.sum(null, null));
	}
	
	//subtraction
	@Test
	public void testSub() {
		System.out.println("Subtraction test");
		Integer x = 35;
		Integer y = 15;
		Integer expResult = 20;
		Integer result = Calculator.sub(x, y);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testSubNull() {
		System.out.println("Subtraction test Null part");
		assertEquals(null, Calculator.sub(15, null));
		assertEquals(null, Calculator.sub(null, 15));
		assertEquals(null, Calculator.sub(null, null));
	}
	
	// Multiplication
	@Test
	public void testMulti() {
		System.out.println("Multiplication test");
		Integer x = 10;
		Integer y = 15;
		Integer expResult = 150;
		Integer result = Calculator.multi(x, y);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testMultiNull() {
		System.out.println("Multiplication test Null part");
		assertEquals(null, Calculator.multi(15, null));
		assertEquals(null, Calculator.multi(null, 15));
		assertEquals(null, Calculator.multi(null, null));
	}
	
	// Division
	@Test
	public void testDiv() {
		System.out.println("Division test");
		Integer x = 35;
		Integer y = 5;
		Integer expResult = 7;
		Integer result = Calculator.div(x, y);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testDivNull() {
		System.out.println("Division test Null part");
		assertEquals(null, Calculator.div(15, null));
		assertEquals(null, Calculator.div(null, 15));
		assertEquals(null, Calculator.div(null, null));
	}
	
	@Test
	public void testDivZero() {
		System.out.println("Division test Zero part");
		assertEquals(null, Calculator.div(15, 0));
	}
}