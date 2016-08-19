package com.parameterizedtest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ParamViaFieldsInj {
	private Addition additionObj;

	@Before
	public void initialize() {
		additionObj = new Addition();
	}

	// default value = 0
	@Parameter(value = 0)
	public int numberA;

	@Parameter(value = 1)
	public int numberB;

	@Parameter(value = 2)
	public int expected;

	// name attribute is optional, provide an unique name for test,
	//it helps to identify individual test cases by providing a unique name.
	
	// multiple parameters, uses Collection<Object[]>
	@Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
				{ 3, 2, 5 }, 
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
