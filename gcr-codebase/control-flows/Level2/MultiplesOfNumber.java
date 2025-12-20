import java.util.Scanner;
//Creating class MultiplesOfNumber to find multiple of number
public class MultiplesOfNumber {
	public static void main(String[] args) {
		//Taking number as input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		//check positive and less than 100
		if(number > 0 && number < 100){
			// use for  loop backward and check multiple
			for (int i = 100; i >= 1; i--) {
				if (i % number == 0) {
					System.out.println(i);
				}
			}
 		}else{
            System.out.println("Invalid input.");
		}
	}
}
