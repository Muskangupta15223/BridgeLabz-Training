import java.util.*;
// create class and print number 1 to n and do some tasks
public class PrintFizzBuzzAndNumber{
	public static void main(String args[]){ 
		//Taking number as input from user	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		//check condition and perform operations for positive input only
		if(number > 0){

			// use for loop here
			for(int i = 1; i <= number; i++){
				if(i % 3 == 0){
					System.out.println("Fizz");
				}else if(i % 5 == 0){
					System.out.println("Buzz");
				}else if(i % 15 == 0){
					System.out.println("FizzBuzz");
				}else{
					System.out.println(i);
				}
			}
		}else{
			System.out.println("It is negative number");
		}
	}
} 