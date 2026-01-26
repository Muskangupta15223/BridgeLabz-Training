package com.collection.junit;

public class StringUtils {

		public boolean isPalindrome(String str) {
			int n = str.length();
			for(int i = 0; i <= n / 2; i++) {
				if(str.charAt(i) != str.charAt(n- i - 1)) 
					return false;
			}
			return true;
		}
		
		public String reverseString(String str) {
			StringBuilder reversed = new StringBuilder();
			for(int i = str.length() -1; i>= 0; i--) {
				reversed.append(str.charAt(i));
			}
			return reversed.toString();
		}
		
		public String convertToUpperCase(String str) {
			StringBuilder s = new StringBuilder();
			if(str == null) return null;
			for(char ch : str.toCharArray()) {
				int ascii = (int)ch;
				if(ascii >= 97 && ascii <= 122) { 
					ch = (char)(ascii - 32);
				}	
				s.append(ch);      
			}
			return s.toString();
		}
}
