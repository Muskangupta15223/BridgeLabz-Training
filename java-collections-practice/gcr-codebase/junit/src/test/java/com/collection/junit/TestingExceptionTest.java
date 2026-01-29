package com.collection.junit;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingExceptionTest {

	 @Test
	 void divisionByZeroTest() {
		Exception e = assertThrows(ArithmeticException.class, () -> {
			TestingException.division(5, 0);
		});
		Assertions.assertEquals("Division by zero is not allowed.", e.getMessage());
	 }
}
