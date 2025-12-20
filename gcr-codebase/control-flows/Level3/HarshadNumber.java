import java.util.*;
// create class HarshadNumber to check the number is HarshadNumber or not. eg->21 which is perfectly divided by 3 (sum of digits: 2 + 1).

public class HarshadNumber{
	public static void main(String args[]){ 	
		//Taking number as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		int temp = number;
		
			
		// using while to find the sum
		while(number > 0){
			int remainder = number % 10;
			number = number / 10;
			sum += remainder;
		}	

		if(temp % sum == 0){
			System.out.println("Harshad Number");
		}else{
			System.out.println("not a Harshad Number");	
		}
		sc.close();
	}
}