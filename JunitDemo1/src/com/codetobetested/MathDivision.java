package com.codetobetested;

public class MathDivision {
	private int a;
	private int b;

	public MathDivision(int a, int b) {
		this.setA(a);
		this.setB(b);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int div() throws ArithmeticException{
		return (a/b);
	}
}
