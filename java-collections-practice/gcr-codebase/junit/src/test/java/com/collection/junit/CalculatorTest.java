package com.collection.junit;
import static org.junit.Assert.assertThrows;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest
{
	  Calculator calculator = new Calculator();
	  
	@Test
	 void additionTest() {
		int result = calculator.addition(5, 3);
		Assertions.assertEquals(8, result);
	}
	
	@Test
	 void subtractTest() {
		int result = calculator.subtract(15, 3);
		Assertions.assertEquals(12, result);
	}
	
	@Test
	 void multiplyTest() {
		int result = calculator.multiply(6, 3);
		Assertions.assertEquals(18, result);
	}
	
	@Test
	 void divisionTest() {
		int result = calculator.division(9, 3);
		Assertions.assertEquals(3, result);
	}
   @Test
	 void divisionByZeroTest() {
		Exception e = assertThrows(ArithmeticException.class, () -> {
			calculator.division(5, 0);
		});
		Assertions.assertEquals("Division by zero is not allowed.", e.getMessage());
	 }
}
