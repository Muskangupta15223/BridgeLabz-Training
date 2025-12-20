import java.util.*;
// create class DigitCount to count how many digit present in number 
public class DigitCount{
	public static void main(String args[]){ 	
		//Taking number as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		int temp = number;
		
		// using while loop to count the digit
		while(number > 0){
			int remainder = number % 10;
			number = number / 10;
			count++;
		}

		System.out.println("the digit count of " + temp + " number is : " + count);
		sc.close();
	}
}