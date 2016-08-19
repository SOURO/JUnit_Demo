package com.suitetest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.codetotest.MathCalculationTest1;
import com.codetotest.MathCalculationTest2;
import com.codetotest.TestExpectedException;
import com.junitassertions.JUnitAssertionsDemo;
import com.timeouttest.JunitTimeoutDemo;

@RunWith(Suite.class)
@SuiteClasses({MathCalculationTest1.class,MathCalculationTest2.class,TestExpectedException.class,JUnitAssertionsDemo.class,JunitTimeoutDemo.class})
public class SuiteTestsDemo {

}
