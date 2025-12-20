import java.util.*;
// create class PrimeNumberOrNot to check the number is a prime number or not
public class PrimeNumberOrNot{
	public static void main(String args[]){ 	
		//Taking number as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean isPrime = true;
		for(int i = 3; i * i < number; i++){
			if(number % i == 0){
				isPrime = false;
				System.out.println("Not a prime Number");
				break;
			}
		}
		
		if(isPrime){
			System.out.println("prime Number");
		}
		sc.close();
	}
}