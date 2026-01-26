package com.regex.extraction;

import java.util.*;
import java.util.regex.*;

public class ExtractLinks {

public static List<String> extractLinks(String text) {
    List<String> list = new ArrayList<>();
    
    String regex = "\\bhttps?://[\\w.-]+(?:\\.[\\w\\.-]+)+[/\\w\\.-]*\\b";
    
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    
    while (matcher.find()) {
        list.add(matcher.group());
    }
    
    return list;
}

public static void main(String[] args) {
    String text = "Visit https://www.google.com and http://example.org for more info.";

    List<String> links = extractLinks(text);
    System.out.println(links);  
    }
}