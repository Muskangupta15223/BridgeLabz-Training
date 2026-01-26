package com.regex.extraction;
import java.util.*;
import java.util.regex.*;
public class ExtractEmailAddress {

	public static List<String> extractemail(String text){
		List<String> emails = new ArrayList<>();
		
		String regex = "[a-zA-z0-9._%+-]+@[a-zA-z0-9.-]+\\.[a-zA-Z]{2,}";
		String[] words = text.split("\\s+"); // split by space

        for (String word : words) {
            if (word.matches(regex)) {
                emails.add(word);
            }
        }
        return emails;
    }
	
	public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";

        List<String> result = extractemail(text);
        System.out.println(result);
    }
}
