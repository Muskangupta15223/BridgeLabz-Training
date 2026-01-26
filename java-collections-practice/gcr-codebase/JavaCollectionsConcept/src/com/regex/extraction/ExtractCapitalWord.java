package com.regex.extraction;

import java.util.*;

public class ExtractCapitalWord {

	public static List<String> extractCapital(String text){
		
		List<String>list = new ArrayList<>();
		String regex = "\\b[A-Z][a-z]+\\b";
		String[] words = text.split(" ");
		for(String word : words) {
			if(word.matches(regex)) {
				list.add(word);
			}
		}
		return list;
	}	
	public static void main(String args[]) {
		 String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

	        List<String> result = extractCapital(text);
	        System.out.println(result);
	    }
}
