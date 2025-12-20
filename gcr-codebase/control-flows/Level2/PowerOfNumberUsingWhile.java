import java.util.*; 
//Creating class PowerOfNumberUsingWhile to find power using loop
public class PowerOfNumberUsingWhile{
	public static void main(String args[]){
		//Taking number and power as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		int result = 1;
		//check positive and less than 100
		if(number > 0 && number < 100){
			int i = 1;
			//using while loop find the result of number

			while(i <= power){
				result *= number;
				 i++;
			}
			System.out.println("Result is:" + result);
 		}else{
            System.out.println("Invalid input.");
		}

	}
}