package com.collection.junit;
import java.util.Scanner;

public class Calculator 
{
	
	public int addition(int a , int b) {
		return a + b;
	}
	public int subtract(int a , int b) {
		return a - b;
	}
	public int multiply(int a , int b) {
		return a * b;
	}
	public int division(int a , int b) {
		if(b == 0) {
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		return a / b;
	}
    public void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter value a or b");
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	System.out.println(addition(a,b));
    	System.out.println(subtract(a,b));
    	System.out.println(multiply(a,b));
    	System.out.println(division(a,b));
    }
    
}
