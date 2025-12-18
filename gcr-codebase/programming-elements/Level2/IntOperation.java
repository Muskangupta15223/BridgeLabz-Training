import java.util.*;
//Creating class IntOperation to perform operation on 3 numbers
public class IntOperation{
	public static void main(String args[]){
		// Taking a, b, and c as input from user
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// perform Calculation and store in variables
		int result1 = a + b *c;
		int result2 = a * b + c;
		int result3 = a % b + c;

		//display output
		System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and "+ result3);

	}
}