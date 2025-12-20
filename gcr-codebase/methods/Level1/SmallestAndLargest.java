import java.util.*;
public class SmallestAndLargest{
	
	//Creating a method findSmallestAndLargest for finding smallest and largest among three numbers
	public static int[] findSmallestAndLargest(int a, int b, int c){
		int[] arr = new int[2];
		arr[0] = (a < b )? ((a < c)? a:c) :  ((b < c )? b:c );
		arr[1] = (a > b )? ((a > c)? a:c) :  ((b > c )? b:c );
		return arr;
	}

	public static void main(String args[]){
		//Taking input number1,number2, and number3 from user
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();

		// Creating object Sl and call the method
		SmallestAndLargest sL = new SmallestAndLargest();
		System.out.println(Arrays.toString(sL.findSmallestAndLargest(number1,number2,number3)));

	}
}