import java.util.*;
public class CheckPosOrNeg{

	//create a method to check number is positive or negative
	public static boolean isPositive(int num){
		if(num > 0) return true;
		return false;
	}
	//create a method to check number is even or odd
	public static boolean isEven(int num){
		if(num % 2 == 0) return true;
		return false;
	}
	//create a method for compare
	public static int compare(int num1 , int num2){
		if(num1 > num2) return 1;
		else if(num1 < num2) return -1;
		return 0;
	}



	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		for(int i = 0; i < 5; i++){
			num[i] = sc.nextInt();
		}

		for(int i = 0; i < num.length; i++){
			// call method to check num is positive and even or not
			if(isPositive(num[i])){
				System.out.println(num[i] + " is Even : " + isEven(num[i]));
			}else{
				System.out.println("negative");
			}
		}

		//call compare method between first and last element
		if(compare(num[0] , num[4]) == 1){
			System.out.println("num1 is greater than num2");
		}else if(compare(num[0] , num[4]) == -1){
			System.out.println("num1 is less than num2");
		}else{
			System.out.println("num1 and num2 is equal");
		} 
	}
}
