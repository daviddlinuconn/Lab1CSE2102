package com.mycompany.app;

public class TestMe {
	private double value = Double.NaN;
	private int value2;

	public static void main(String[] args) {
		System.out.println("Lab1: Hello world!");
	}

	public TestMe() {

	}

	public double square() {
		return value*value;
	}

	public double cube() {
		return 6*value*value;
	}

	public void setValue(double v) {
		value = v;
	}

	public int addTwo(){
		return value2 + 2;
	}

	public int scaleBySix() {
		int number = 6;
		int scaledInteger = value2 * 6;
		return scaledInteger;
	}

	public void setInt(int i) {
		value2 = i;
	}

}
