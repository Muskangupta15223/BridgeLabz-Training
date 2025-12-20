import java.util.*;
// create class AbundantNumber to check the number is AbundantNumber or not ( Divisor of 12: 1, 2, 3, 4, 6 Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12)
public class AbundantNumber{
	public static void main(String args[]){ 	
		//Taking number as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		int temp = number;
		
		// using for loop to find the divisor of given number
		for(int i = number/2; i >= 1; i--){
			if( number % i == 0){
				sum += i;
			}		
		}	

		// check sum is greater than input then it is called Abundant number
		if(sum > temp ){
			System.out.println("Abundant Number");	
		}else{
			System.out.println("not a Abundant Number");	
		}
		sc.close();
	}
}