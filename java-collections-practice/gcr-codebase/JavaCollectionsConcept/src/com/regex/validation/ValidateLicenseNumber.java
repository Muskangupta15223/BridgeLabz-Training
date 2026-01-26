package com.regex.validation;

import java.util.Scanner;

public class ValidateLicenseNumber {

	public static boolean isValidLicenseNumber(String str) {
		if(str == null) {
			return false;
		}
		return str.matches("^[A-Z]{2}[0-9]{4}$");
		
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter license number");
		String str = sc.nextLine();
		System.out.println(isValidLicenseNumber(str));
		
	}
}
