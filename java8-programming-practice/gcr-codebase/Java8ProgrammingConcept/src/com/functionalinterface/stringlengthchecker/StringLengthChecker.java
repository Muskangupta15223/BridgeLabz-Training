package com.functionalinterface.stringlengthchecker;

import java.util.Scanner;
import java.util.function.Function;

public class StringLengthChecker {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int limit = 25;
		
		Function<String, Integer> lengthChecker = msg -> msg.length();
		
		System.out.println("Enter message");
		String msg = sc.nextLine();
		int length = lengthChecker.apply(msg);
		
		System.out.println(
				length > limit ? "Too Long" : "Valid");
		
	}
}
