import java.util.*;
public class RemainderAndQuotient{
//Creating a method findRemainderAndQuotient for finding remainder and quotient of a number
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int[] arr = new int[2];
		arr[0] = number % divisor;
		arr[1] = number / divisor;
		return arr;
	}

	public static void main(String args[]){
		// taking number and divisor as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int divisor = sc.nextInt();

		RemainderAndQuotient rQ = new RemainderAndQuotient();		
		System.out.println("the remainder and quotient of the given number is " + Arrays.toString(rQ.findRemainderAndQuotient(number,divisor)));
	}
}