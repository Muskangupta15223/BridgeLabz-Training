import java.util.*;
//creating class FactorialUsingWhile for finding factorial of a number using a while loop
public class FactorialUsingWhile{
	public static void main(String args[]){
		// taking number as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int fact = 1 ;

		// calculating factorial of number using while loop
		while(number > 1){  
			fact *= number;
			number--;	
		}
	
		//display factorial as output
		System.out.println(fact);
	}
}