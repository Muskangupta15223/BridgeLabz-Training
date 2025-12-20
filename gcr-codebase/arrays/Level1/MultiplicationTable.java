import java.util.*;
// Create class  MultiplicationTable to print the table
public class  MultiplicationTable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		//declare array of num name
		int[] num = new int[10];

		//store the value using for loop
		for(int i = 1; i <= 10; i++){
			num[i-1] = number * i;
		}
		
		// printing the table
		for(int i = 1; i <= 10; i++){
			System.out.println(number + " * " + i + " = " + num[i-1]);
		}

		//close the scanner
		sc.close();
	}
}