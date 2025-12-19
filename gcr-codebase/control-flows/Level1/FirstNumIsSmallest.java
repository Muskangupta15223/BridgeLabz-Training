import java.util.*;
public class FirstNumIsSmallest{
	public static void main(String args[]){	
		//Taking number1, number2, and number3 as input from user
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();	
		int number3 = sc.nextInt();
                
		//use logical AND operator to find smallest value 
		System.out.println("Is the first number the smallest? " + (number1 < number2 && number1 < number3));
				
	}
}