import java.util.*;
// creating class GreatestFactor and print values of highest factors of that number
public class GreatestFactor{
	public static void main(String args[]){ 
		//Taking number as input from user	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int greatestFactor = 1;

		if(number > 0){
			System.out.println("Factors are :");

			//using for loop to find greatestfactor
			for(int i = number/2; i >= 1; i--){
				if(number % i == 0){
					greatestFactor = i;
					break;
				}
			}

		}else{
			System.out.println("Negative Number");
		}
		System.out.println("greatestFactor is : " + greatestFactor );
	}
}