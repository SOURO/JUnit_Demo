package com.codetotest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.codetobetested.MathCalculation;

public class MathCalculationTest2 {

	MathCalculation mathCalculationObj = new MathCalculation(5000, 3000);

	// execute only once, in the starting
	@BeforeClass
	public static void testBeforeClass() {
		System.out
				.println("@BeforeClass - Executed (once) before all test cases' execution\n");
	}
	
	//execute for each test, before executing test
	@Before
	public void testBefore() {
		System.out
				.println("@Before - Executed (everytime) before all test cases' execution");
	}

	@Test
	public void testGetA() {
		System.out.println("Testing of getA() method");
		int expectedA = 5000;
		int result = mathCalculationObj.getA();
		assertEquals(result, expectedA);
	}

	@Test
	public void testGetB() {
		System.out.println("Testing of getB() method");
		int expectedB = 3000;
		int result = mathCalculationObj.getB();
		assertEquals(result, expectedB);
	}

	@Test
	public void testAdd() {
		System.out.println("Testing of add() method");
		int add = 5000 + 3000;
		int result = mathCalculationObj.add();
		assertEquals(result, add);
	}

	@Test
	public void testSub() {
		System.out.println("Testing of sub() method");
		int sub = 5000 - 3000;
		int result = mathCalculationObj.sub();
		assertEquals(result, sub);
	}

	@Test
	public void testMulp() {
		System.out.println("Testing of mulp() method");
		int mulp = 5000 * 3000;
		int result = mathCalculationObj.mulp();
		assertEquals(result, mulp);
	}

	@Ignore
	public void testMulp2() {
		System.out.println("@Ignore: This execution is ignored");
		int mulp = 0 * 0;
		int result = mathCalculationObj.mulp();
		assertEquals(result, mulp);
	}
	
	//execute for each test, after executing test
	@After
	public void testAfter() {
		System.out
				.println("@After - Executed (everytime) after all test cases' execution\n");
	}

	// execute only once, in the end
	@AfterClass
	public static void testAfterClass() {
		System.out
				.println("\n@AfterClass - Executed (once) after all test cases' execution");
	}
}
