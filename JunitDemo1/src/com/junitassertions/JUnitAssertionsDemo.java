package com.junitassertions;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitAssertionsDemo {

	@Test
	public void test() {
		String obj1 = "souro";
		String obj2 = "souro";
		String obj3 = "mukherjee";
		String obj4 = "mukherjee";
		String obj5 = null;
		int var1 = 1;
		int var2 = 2;
		int var3 = 4;
		int var4 = 5;
		int[] arithmetic1 = {1,9,9,0};
		int[] arithmetic2 = {1,9,9,0};
		assertEquals(obj1, obj2);
		assertSame(obj3, obj4);
		assertNotSame(obj2, obj4);
		assertNotNull(obj1);
		assertNull(obj5);
		assertTrue("Error: var2 is not greater than var1", var2>var1);
		assertFalse("Error: var3 is greater than var4", var3>var4);
		assertArrayEquals(arithmetic1, arithmetic2);
	}

}
