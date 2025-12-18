
import java.util.*;
// creating class CalculateTotalPrice for finding total price of items
public class CalculateTotalPrice{
	public static void main(String args[]){

		// Taking unitPrice and num2 as user input
		Scanner sc = new Scanner(System.in);         
		int unitPrice = sc.nextInt();
		int quantity = sc.nextInt();
		
		// Calculate the total Price of items
		int totalPrice = unitPrice * quantity;
		
		//display output 
		System.out.println("The total purchase price is INR " +totalPrice + " if the quantity " + quantity +" and unit price is INR " + unitPrice );

	}
}
