import java.util.*;
public class SumOfNaturalNumber{	
//Create a method calculateSumOfNumber for finding sum
	public static int calculateSumOfNumber(int n){
		int sum = 0;
		for(int i = 0; i <= n; i++){
			sum = sum + i;
		}
		return sum;		
	}
	public static void main(String args[]){	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); 

		SumOfNaturalNumber s = new SumOfNaturalNumber();
		System.out.println(s.calculateSumOfNumber(number));
	}
}