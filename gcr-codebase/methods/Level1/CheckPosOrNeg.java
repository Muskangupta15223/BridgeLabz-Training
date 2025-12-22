import java.util.*;
public class CheckPosOrNeg{
	// create a method isPosOrNeg to check num is positive or negative

	public static int isPosOrNeg(int n){
		if(n < 0){return -1;}
		else if(n > 0){return 1;}
		return 0;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isPosOrNeg(num));
	}
}