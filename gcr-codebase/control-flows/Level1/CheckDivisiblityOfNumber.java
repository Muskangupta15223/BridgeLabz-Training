import java.util.*;
//Creating class CheckDivisibleBy5 to check number is divisible by 5 or not
public class  CheckDivisiblityOfNumber {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
	}
}