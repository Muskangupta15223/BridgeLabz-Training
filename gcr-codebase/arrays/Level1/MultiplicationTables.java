import java.util.*;
// Create class  MultiplicationTables to print the table from 6 to 9 only 
public class  MultiplicationTables{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		//declare array of num name
		int[] num = new int[10];
		
		if(number >= 6 && number <= 9){
			//store the value using for loop
			for(int i = 1; i <= 10; i++){
				num[i-1] = number * i;
			}
			
			// printing the table
			for(int i = 1; i <= 10; i++){
				System.out.println(number + " * " + i + " = " + num[i-1]);
			}
		}else{
			System.out.println("Invalid input, give between 6 to 9 only");
		}
		//close the scanner
		sc.close();
	}
}