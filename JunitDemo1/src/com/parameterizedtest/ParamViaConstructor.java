package com.parameterizedtest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ParamViaConstructor {
	private int numberA;
	private int numberB;
	private int expected;
	private Addition additionObj;

	@Before
	public void initialize() {
		additionObj = new Addition();
	}

	/*
	 * Each parameter should be placed as an argument here Every time runner
	 * triggers, it will pass the arguments from parameters we defined in data()
	 * method ***method name can be anything.
	 */
	public ParamViaConstructor(int numberA, int numberB, int expected) {
		this.numberA = numberA;
		this.numberB = numberB;
		this.expected = expected;
	}

	// name attribute is optional, provide an unique name for test,
	//it helps to identify individual test cases by providing a unique name.
	
	// multiple parameters, uses Collection<Object[]>
	@Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
				{ 5, 5, 10 }, 
				{ 2, 2, 4 },
				{ 8, 2, 10 }, 
				{ 4, 5, 9 }, 
				{ 7, 7, 14 } 
		});
	}

	@Test
	public void testadd() {
		assertEquals(additionObj.add(numberA, numberB), expected);
	}
}
