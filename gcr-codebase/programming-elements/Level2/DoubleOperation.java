import java.util.*;
//Creating a class DoubleOperation operate on 3 numbers
public class DoubleOperation{
	public static void main(String args[]){
		// Taking a, b, and c as input from user
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		// perform Calculation and store in variables
		double result1 = a + b *c;
		double result2 = a * b + c;
		double result3 = a % b + c;

		//display output in double
		System.out.println("The results of double Operations are " + result1 + ", " + result2 + ", and "+ result3);

	}
}