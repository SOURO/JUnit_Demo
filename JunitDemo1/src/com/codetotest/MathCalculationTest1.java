package com.codetotest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.codetobetested.MathCalculation;

public class MathCalculationTest1 {
	
	MathCalculation mathCalculationObj = new MathCalculation(5000,3000);
	
	/*This "@Test" annotation indicates that the public void method
	 *  to which it is attached can be run as a test case.
	 */
	@Test
	public void testGetA() {
		int expectedA = 5000;
		int result = mathCalculationObj.getA();
		/*The method assertEquals takes as inputs two objects
		 *  and asserts that the two objects are equal.
		 */
		assertEquals(result,expectedA);
	}
	@Test
	public void testGetB() {
		int expectedB = 3000;
		int result = mathCalculationObj.getB();
		assertEquals(result,expectedB);
	}
	@Test
	public void testAdd(){
		int add = 5000+3000;
		int result = mathCalculationObj.add();
		assertEquals(result,add);
	}@Test
	public void testSub(){
		int sub = 5000-3000;
		int result = mathCalculationObj.sub();
		assertEquals(result,sub);
	}
	@Test
	public void testMulp(){
		int mulp = 5000*3000;
		int result = mathCalculationObj.mulp();
		assertEquals(result,mulp);
	}

}
