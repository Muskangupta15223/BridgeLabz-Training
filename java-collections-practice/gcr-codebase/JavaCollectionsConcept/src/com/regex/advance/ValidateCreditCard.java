package com.regex.advance;

public class ValidateCreditCard {

	    public static boolean isVisa(String card) {
	        return card.matches("^4\\d{15}$");
	    }

	    public static boolean isMasterCard(String card) {
	        return card.matches("^5\\d{15}$");
	    }

	    public static void main(String[] args) {

	        String visa = "4123456789012345";
	        String master = "5123456789012345";

	        System.out.println(isVisa(visa));      
	        System.out.println(isMasterCard(visa)); 
	        System.out.println(isVisa(master));       
	        System.out.println(isMasterCard(master));
	  }
}
