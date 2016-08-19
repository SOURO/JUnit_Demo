package com.timeouttest;

import org.junit.Test;

public class JunitTimeoutDemo {

	@Test(timeout = 50)
	public void test() {
		while (true) {
			System.out.println("Is in infinite loop");
		}
	}

}
