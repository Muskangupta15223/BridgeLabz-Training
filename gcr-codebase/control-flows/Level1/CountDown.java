import java.util.*;
// Creating class countDown for launch the rocket
public class CountDown{
	public static void main(String args[]){
		// taking number as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		// using while loop for decrement the counter
		while(number-- > 1){ 
		System.out.println(number);
		}
	}
}