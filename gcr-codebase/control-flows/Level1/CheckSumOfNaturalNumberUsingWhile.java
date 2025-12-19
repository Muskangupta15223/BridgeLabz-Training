import java.util.*;
// creating class CheckSumOfNaturalNumber for checking computation using while and formula
 public class CheckSumOfNaturalNumberUsingWhile{
	public static void main(String args[]){
		//Taking number as input from user 
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); 
		int total = 0;

		// calculate sum of number using while loop 
		int sum = (number * (number + 1))/2;
		while(number > 0){
			total += number;
		        number--;
		}
		
		// check both way give the same result or not
		if(total == sum){
			System.out.println("Both are same");
		}
		else{
			System.out.println("Both are not same");

		}
		
	}
}