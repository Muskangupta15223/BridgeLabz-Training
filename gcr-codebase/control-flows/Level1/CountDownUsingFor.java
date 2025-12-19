import java.util.*;
public class  CountDownUsingFor{
	public static void main(String args[]){
		// taking number as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		// using For loop for decrement the counter
		for(int i = number; i > 0; i--){
		System.out.println(i);	
		}
	}
}