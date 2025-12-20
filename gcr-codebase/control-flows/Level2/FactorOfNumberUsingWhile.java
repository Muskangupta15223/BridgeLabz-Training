import java.util.*;
// create class FactorsOfNumberUsingWhile and print values of factors
public class FactorOfNumberUsingWhile{
	public static void main(String args[]){ 
		//Taking number as input from user	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number > 0){
			System.out.println("Factors are :");
			int i = 1;

			//using while loop to find factor
			while(i < number){
				if(number % i == 0){
					System.out.println(i);
				}
			 i++;
			}

		}else{
			System.out.println("Negative Number");
		}
	}
}