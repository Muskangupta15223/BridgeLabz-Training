import java.util.*;
// create class FactorsOfNumber and print values of factors
public class FactorsOfNumber{
	public static void main(String args[]){ 	
		//Taking number as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number > 0){
			System.out.println("Factors are :");
			//using for loop to find greatestfactor
			for(int i = 1; i < number; i++){
				if(number % i == 0){
					System.out.println(i);
				}
			}
		}else{
			System.out.println("Negative Number");
		}
	}
}