package com.codetotest;

import org.junit.Test;

import com.codetobetested.MathDivision;

public class TestExpectedException {

	MathDivision mathDivisionObj = new MathDivision(5, 0);

	@Test(expected = ArithmeticException.class)
	public void testDiv() {
		mathDivisionObj.div();
	}
}
