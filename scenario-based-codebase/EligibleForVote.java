import java.util.*;
public class EligibleForVote{
	// method to check eligiblity of vote
	public static boolean isEligible(int age){
		if(age >= 18) return true;
		return false;
	}
	public static void main(String args[]){
		// take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of people : ");
		int age;
		while(true){
			age = sc.nextInt();
			if(age == 0){
				System.out.println("Invalid input!! Exit");
				break;
			}else{
			System.out.println("The eligibility for vote of this age " + age + " is " + isEligible(age));
			}
		}
	}
}