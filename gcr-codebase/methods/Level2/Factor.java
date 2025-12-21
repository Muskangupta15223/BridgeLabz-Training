import java.util.*;
public class Factor{
	// declare a method for find the factor and count the factors
	public static int[] findFactor(int num){
		int count = 0;
		for(int i = 1; i <= num; i++){
 			if(num % i == 0){
				count++;
			}
		}
		
		int[] arr = new int[count];
		int idx = 0;
		for(int i = 1; i <= num; i++){
			if(num % i == 0){
			arr[idx++] = i;
			}	
		}
		return arr;
	}
	// declare method for sum of the factor
	public int sumOfFactor(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length;i++){
			sum += arr[i];
		}
		return sum;
	}
	// declare method for product of the factor
	public int productOfFactor(int [] arr){
		int product = 1;
		for(int i = 0; i < arr.length;i++){
			product *= arr[i];
		}
		return product;

	
	// declare method for sum of the square of the factors
	public double sumOfSquareFactor(int[] arr){
		double sumSq = 0;
		for(int i = 0; i < arr.length;i++){
			sumSq = sumSq + Math.pow(arr[i],2);
		}
		return sumSq;
	}
	

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// create object and call the methods
		Factor f = new Factor();
		int[] factors = f.findFactor(num);
		System.out.println("Factors are : ");
		for(int i = 0; i < factors.length; i++){
			System.out.print(factors[i] + " ");
		}

			// print the output
			System.out.println("Sum of factors are :" + f.sumOfFactor(factors));
			System.out.println("product of factors are :" + f.productOfFactor(factors));
			System.out.println("sum of square of factors are :" + f.sumOfSquareFactor(factors));

	}
}