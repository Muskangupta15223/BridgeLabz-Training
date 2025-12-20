import java.util.*;
// Create class StudentVoteOrnot to check student able to vote or not
public class StudentVoteOrNot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// decalre array of studentAge name
		int[] studentAge = new int[10];

		//for is used to take inputs from the user
		for(int i = 0; i < studentAge.length; i++){
			studentAge[i] = sc.nextInt();
		}
		
		for(int i = 0; i < studentAge.length; i++){
			if(studentAge[i] <= 0 || studentAge[i] > 100){
				System.out.println("Invalid Age");
			}else{

				if(studentAge[i] >= 18){
					System.out.println("The student with the age "+ studentAge[i] +" can vote");
				}else{
					System.out.println("The student with the age "+ studentAge[i] +" cannot vote");
				}
			}

		}
	}
}