package com.regex.extraction;

import java.util.*;
import java.util.Scanner;
import java.util.regex.*;

public class ExtractDate {


     public static List<String> extractDates(String text) {
     List<String> list = new ArrayList<>();
        
     String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";
      
     Pattern pattern = Pattern.compile(regex);
     Matcher matcher = pattern.matcher(text);
      
     while (matcher.find()) {
          list.add(matcher.group());
     }
      
      return list;
  }
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
		
		System.out.println(extractDates(str));
	 }
}
