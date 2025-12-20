import java.util.*;
//creating class MultiplicationTable to print table  
public class MultiplicationTable{
	public static void main(String args[]){
		//taking number as input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 6 to 9 only");
		int number = sc.nextInt();
		
		//Make table for value which comes between 6 to 9
		if(number >= 6 && number <= 9){
			for(int i = 1; i < 11; i++){
				System.out.println(number + " * " + i + " = " + number * i);
			}
		}	
	}
}