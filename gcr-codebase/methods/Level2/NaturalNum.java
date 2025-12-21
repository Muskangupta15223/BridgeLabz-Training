import java.util.*;
public class NaturalNum{

	//declare a method for sum without using recursion
	public int sumOfNumber(int num){
		int sum = num * (num + 1) / 2; 
		return sum;
	}
	
	//declare a method for sum with using recursion
	public int sumUsingRec(int num, int sum){
		sum += num;
		if(num == 1 ){
		return sum;
		}
 		return sumUsingRec(num-1,sum);
		
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		// create object and call method 
		NaturalNum s = new NaturalNum();
			System.out.println("Sum without using recursion" + s.sumOfNumber(number));
			System.out.println("Sum using recursion" + s.sumUsingRec(number,0));

	}
}