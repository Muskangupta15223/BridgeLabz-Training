package com.regex.validation;

import java.util.Scanner;

public class ValidateHexColor {

	public static boolean isValidHexCode(String str) {
		if(str == null) {
			return false;
		}
		return str.matches("^[#][0-9A-Fa-f]{6}");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		String ans = (isValidHexCode(str) == true)? "Valid Hex Colour code" : "Invalid colour code";
		System.out.println(ans);
	}
}
