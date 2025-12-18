import java.util.*;
// Creating class BasicCalculator for doing calculation using arithematic operations
public class BasicCalculator{
	public static void main(String args[]){
		//Taking num1 and num2 as input from user
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextInt();
		float num2 = sc.nextInt();
		
		//calculation of operations
		float addition = num1 + num2 ;
		float subtraction = num1 - num2 ;
		float multiplication = num1 * num2;
		float division = num1/ num2;
		
		//display arithematic operation output
		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + num1 + " and " + num2 + " is "+ addition + " , " + subtraction + ", " + multiplication + ", and " + division);

	}
}

