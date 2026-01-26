package com.regex.validation;

import java.util.Scanner;

public class ValidateUsername {


    public static boolean isValidUsername(String username) {
        if (username == null) {
            return false;
        }
        return username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$");
    }
    
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter userame");
    	String str = sc.nextLine();
    	String result = (isValidUsername(str) == true) ? "Valid username" : "Invalid Username";
    	System.out.println(result);
    }
 }
