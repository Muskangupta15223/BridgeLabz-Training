package com.regex.advance;
import java.util.ArrayList;
import java.util.*;
import java.util.regex.*;
public class ExtractProgrammingLanguage {

	  public static List<String> extractLanguages(String text) {

	      List<String> languages = List.of(
	    	"Java", "Python", "JavaScript", "Go", "C", "C++", "C#", "Ruby", "Kotlin"
          );

	      List<String> result = new ArrayList<>();

	      for (String lang : languages) {
	           String regex = "\\b" + Pattern.quote(lang) + "\\b";
	           Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	           Matcher matcher = pattern.matcher(text);

	           if (matcher.find()) {
	               result.add(lang);
	           }
          }
            return result;
	     }

	     public static void main(String[] args) {
	         String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

	       System.out.println(extractLanguages(text));
	     }
}
