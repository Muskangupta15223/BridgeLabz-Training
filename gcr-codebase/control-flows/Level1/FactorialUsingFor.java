import java.util.*;
//creating class FactorialUsingFor for finding factorial of a number using a for loop
public class FactorialUsingFor{
	public static void main(String args[]){
		// taking number as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int fact = 1 ;

		// calculating factorial of a number using for loop
		for(int i = number ; i > 1; i--){
			fact *= i;
		}
		System.out.println(fact);
	}
}