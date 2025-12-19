import java.util.*;
// creating class CheckSumOfNaturalNumber for checking computation using For and formula
 public class CheckSumOfNaturalNumber{
	public static void main(String args[]){
		//Taking number as input from user 
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); 
		int total = 0;

		// calculate sum of number using for loop 
		for(int i = 1; i <= number; i++){
			total += i;

		}
		int sum = number * (number + 1)/2;
		if(total == sum){
			System.out.println("Both are same");
		}
		else{
			System.out.println("Both are not same");

		}
		
	}
}