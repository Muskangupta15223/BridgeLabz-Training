import java.util.*;
public class ChocolateDistribution{
//Creating a method findRemainderAndQuotient for finding remainder and quotient of a number
	public static int[] findTotalDistribution(int number, int divisor){
		int[] arr = new int[2];
		arr[0] = number % divisor;
		arr[1] = number / divisor;
		return arr;
	}

	public static void main(String args[]){
		// taking chocolate and children as input from user
		Scanner sc = new Scanner(System.in);
		int chocolate = sc.nextInt();
		int children = sc.nextInt();

		ChocolateDistribution cD = new ChocolateDistribution();		
		System.out.println("the remaining chocolate and number of choclate that distribute among children is " + Arrays.toString(cD.findTotalDistribution(chocolate,children)));
	}
}