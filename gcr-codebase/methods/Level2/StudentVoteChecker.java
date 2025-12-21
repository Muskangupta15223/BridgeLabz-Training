import java.util.*;
public class StudentVoteChecker{
	// create a method to check student can vote or not
	public boolean canStudentVote(int age){
		if(age >= 18) return true;
		return false;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];

		// create object and take input from user and call method to check for each input
		StudentVoteChecker v = new StudentVoteChecker();
		for(int i = 0; i < 10; i++){		
			age[i] = sc.nextInt();
			System.out.println("Age is : " + age[i] + " and eligible for vote : " + v.canStudentVote(age[i]));
		}
	}
}