import java.util.*; 
//Creating class PowerOfNumberUsing to find power using loop
public class PowerOfNumber{
	public static void main(String args[]){
		//Taking number and power as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		int result = 1;
		//check positive and less than 100
		if(number > 0 && number < 100){
			//using for loop find the result of number
			for(int i = 1; i <= power; i++){
				result *= number;
			}
			System.out.println("Result is:" + result);
 		}else{
            System.out.println("Invalid input.");
		}

	}
}