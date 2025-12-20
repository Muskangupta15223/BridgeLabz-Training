import java.util.*;
//Create class fizzBuzz to store value in array as well as fizz buzz like string .
public class FizzBuzzArr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int idx = 0;

		//Declare array 
		String arr[] = new String[number];
		
		//store values to follow conditions
		for(int i = 1; i <= number; i++){
			if( i % 15 == 0){
				arr[ i - 1 ] = "FizzBuzz";
			}else if( i % 3 == 0){
				arr[ i - 1 ] = "Fizzz";
			}else if( i % 15 == 0){
				arr[ i - 1 ] = "Buzz";

			}else{
				arr[i - 1] = String.valueOf(i);
			}
		}

		//Print values
		for(int i = 0; i < number; i++){
			System.out.println("Position " + (i+1) + "="+ arr[i]);

		}
	}
}