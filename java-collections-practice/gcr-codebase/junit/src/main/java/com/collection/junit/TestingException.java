package com.collection.junit;

public class TestingException {

	public static int division(int a , int b) {
		if(b == 0) {
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		return a / b;
	}
	
}
