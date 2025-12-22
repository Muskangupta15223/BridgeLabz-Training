import java.util.*;
public class NumberChecker3{
	// create methods to check a number is prime, neon, spy, automorphic or buzz.
	public static boolean isPrime(int n){
		if( n == 1 || n== 2){
			return true;
		}
		for(int i = 3; i * i <= n; i++){
			if(n % i == 0){
				return false;
			}
		}	
		return true;
	}

	public static boolean isNeon(int n){
		int rem = 0, sum = 0 , temp =n; 
		while( n > 0){
			rem = n % 10;
			sum += rem;
			n = n / 10;
		}
		sum = (int)Math.pow(sum,2);
		if(sum != temp){
			return false;
		}	
		return true;
	}

	public static boolean isSpy(int n){
		int rem = 0, sum = 0 , product = 1; 
		while( n > 0){
			rem = n % 10;
			sum += rem;
			product *= rem;
			n = n / 10;
		}
		if(sum != product){
			return false;
		}	
		return true;
	}

	public static boolean isAutomorphic(int number) {
        	int square = number * number;
        	return String.valueOf(square).endsWith(String.valueOf(number));
 	}

	public static boolean isBuzz(int number) {
		return number % 7 == 0 || number % 10 == 7;
	}
 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me number : ");
		int num = sc.nextInt();

		// display the output
		System.out.println("This isNumber "+ isPrime(num));
		System.out.println("This is Neon Number "+ isNeon(num));
		System.out.println("This is Spy Number "+ isSpy(num));
		System.out.println("This is Automorphic Number "+ isAutomorphic(num));
		System.out.println( "This is Buzz Number "+ isBuzz(num));
	}
}