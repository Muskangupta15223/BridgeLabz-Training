import java.util.*;
// Creating class SumOfNaturalNumber for checking number is natural or not.
 public class SumOfNaturalNumber{
	public static void main(String args[]){
		//Taking number as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		// check number is positive or not
		if(number > 0){
			int sumOfNumber = (number * (number + 1))/2;
			System.out.println("The sum of "+ number + " natural number is " + sumOfNumber);
		}
		else{
			System.out.println("The number "+ number + " is not a natural number");

		}

	}

}