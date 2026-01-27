package com.regex.advance;
import java.util.Scanner;

public class ValidateIPAddress {

	 public static boolean isValidIP(String ip) {
	        String regex =
	            "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}" +
	            "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

	        return ip.matches(regex);
	    }
	 
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter string");
		 String ip = sc.nextLine();
		 
		  System.out.println(isValidIP("192.168.1.1")); 
	        System.out.println(isValidIP("256.1.1.1"));      
	 }
	
}
