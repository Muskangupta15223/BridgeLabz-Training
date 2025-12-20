import java.util.*;
public class  maximumNumberOfHandshakes{
	
	//Creating a method calculateMaximumHandshakes for finding maximum handshakes
	public static int calculateMaximumHandshakes(int totalStudents){
		 totalStudents  = (totalStudents * (totalStudents - 1)) / 2;		
		return totalStudents;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();

		System.out.println("the number of possible handshakes :" + calculateMaximumHandshakes(numberOfStudents));

	}
}