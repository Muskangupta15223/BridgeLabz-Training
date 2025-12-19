import java.util.*;
// Creating class SumOfNumber for sum of all value given by user.
public class SumOfNumber{
	public static void main(String args[]){
		// Taking input number from user inside the loop
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		while(true){
			double number = sc.nextInt();
			if(number == 0){
				System.out.println(total);
				break;
			}else{
				total += number;
				System.out.println("Either Give me input again or press 0 for output");
			}
		}

	}
}