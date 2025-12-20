import java.util.*;
// Create class  CheckPosOrNeg to check value is positive or negative as well as even or odd
public class  CheckPosOrNeg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//declare array of num name
		int[] num = new int[5];
		String ans;

		//for is used to take inputs from the user
		for(int i = 0; i < num.length; i++){
			num[i] = sc.nextInt();
		}

		// use for loop for check value is positive or negative and then even or not 
		for(int i = 0; i < num.length; i++){
			if(num[i] > 0){
				ans = (num[i] % 2 ==0 ) ? "Even": "Odd";
				System.out.println(ans);
			}else if(num[i] == 0){
				System.out.println("Zero");
			}else{
				System.out.println("Negative");
			}
		}

		// apply condition to check first and last element relation
		if(num[0] > num[num.length-1]){
			System.out.println("First element is greater");

		}else if(num[0] < num[num.length]){
			System.out.println("Last element is greater");

		}else{
			System.out.println("Both are equal");
		}
		
		//close the scanner
		sc.close();
	}
}