package com.codetobetested;

public class MathCalculation {
	private int a;
	private int b;

	public MathCalculation(int a, int b) {
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

	public int add() {
		return (a+b);
	}

	public int sub() {
		return (a-b);
	}

	public int mulp() {
		return (a*b);
	}
}
