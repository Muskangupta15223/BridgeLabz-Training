package com.collection.junit;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringUtilsTest {

	StringUtils stringUtils = new StringUtils();
	
	@Test
	void isPalindromeTest() {
		Assertions.assertTrue(stringUtils.isPalindrome("kanak"));
	}
	
	@Test
	void reverseStringTest() {
		String result = stringUtils.reverseString("Muskan");
		Assertions.assertEquals("naksuM", result);
	}
	@Test
	    void convertToUpperCaseTest() {
	        String result = stringUtils.convertToUpperCase("muskan");
	        Assertions.assertEquals("MUSKAN", result);
	    }

	    @Test
	    void convertToUpperCaseWithMixedCase() {
	        String result = stringUtils.convertToUpperCase("VisHal");
	        Assertions.assertEquals("VISHAL", result);
	    }

	    @Test
	    void convertToUpperCaseWithEmptyString() {
	        String result = stringUtils.convertToUpperCase("");
	        Assertions.assertEquals("", result);
	    }

	    @Test
	    void convertToUpperCaseWithNull() {
	        String result = stringUtils.convertToUpperCase(null);
	        Assertions.assertNull(result);
	    }
}
