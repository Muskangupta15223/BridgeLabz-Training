import java.util.*;
// create class ArmstrongNumber to check the number is armstrong or not ( 153 = 1^3 + 5^3 + 3^3 )
public class ArmstrongNumber{
	public static void main(String args[]){ 	
		//Taking number as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		int temp = number;
		
		// using while to perform calculation
		while(number > 0){
			int remainder = number % 10;
			number = number / 10;
			int cube =(int) Math.pow(remainder,3);
			sum += cube;
		}

		//check number is armstrong or not
                if (sum == temp){
			System.out.println("Armstrong number");
		}else{
			System.out.println("Not a Armstrong number");
		}

	}
}