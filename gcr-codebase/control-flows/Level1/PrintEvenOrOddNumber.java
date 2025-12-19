import java.util.*;
//creating class PrintEvenOrOdd to check number is even or odd
public class  PrintEvenOrOddNumber{
	public static void main(String args[]){
	// Take num as input from user 
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
		// use for loop for iteration and check condition for even or odd
		for(int i = 1; i < num ; i++){
			if( i % 2 == 0){
				System.out.println(i + " is Even");
			}else{
				System.out.println(i + " is Odd");
		
			}
		}
	}
}