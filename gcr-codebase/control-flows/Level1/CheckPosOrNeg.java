import java.util.*;
public class CheckPosOrNeg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number > 0 ){
			System.out.println("Number is Positive");
		}else if(number < 0 ){
			System.out.println("Number is Negative");
		}else{
			System.out.println("Number is Zero");
		}
	}
}