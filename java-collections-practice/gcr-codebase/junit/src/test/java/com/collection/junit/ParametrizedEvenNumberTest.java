package com.collection.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedEvenNumberTest {

	ParametrizedEvenNumber paramEven = new ParametrizedEvenNumber(); 
	@ParameterizedTest
	@ValueSource(ints = {2,3, 4, 6, 7, 9})
	
	void IsEvenTest(int num) {
		boolean result = paramEven.isEven(num);
		Assertions.assertEquals(num % 2 == 0 , result);
	}
}
