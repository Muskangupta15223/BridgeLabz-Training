import java.util.*;
// creating class PrintQuotientAndRemainder for finding quotient and remainder of two numbers

public class PrintQuotientAndRemainder{
	public static void main(String args[]){

		// Taking num1 and num2 as user input
		Scanner sc = new Scanner(System.in);         
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// Calculate quotient and remainder
		int quotient = num1 / num2;
		int remainder = num1 % num2;

		System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + num1 + " and " + num2);

	}
}
