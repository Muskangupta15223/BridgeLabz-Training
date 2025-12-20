import java.util.*;
// create class Calculator to perform arithematic operations using switch
public class Calculator{
	public static void main(String args[]){ 	
		//Taking first, second and op as input from user
		Scanner sc = new Scanner(System.in);
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		String op = sc.next();
		
		switch(op){
		case "+":
			System.out.println(first + second);
			break;
		case "-":
			System.out.println(first - second);
			break;
		case "*":
			System.out.println(first * second);
			break;
		case "/":
			System.out.println(first / second);
			break;
		default:
			System.out.println("Invalid input");
			break;

		}

		sc.close();
	}
}