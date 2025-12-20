import java.util.*;
// create class CalculatateGrade to calculate grade and percentage 
public class CalculateGrade{
	public static void main(String args[]){ 	
		//Taking mark1, mark2, and mark3 as input from user
		Scanner sc = new Scanner(System.in);
		int mark1 = sc.nextInt();
		int mark2 = sc.nextInt();
		int mark3 = sc.nextInt();
		String grade;
		String remarks;

		double percentage = (mark1 + mark2 + mark3 )/ 3;		
		if(percentage >= 80){
			grade = "A";
			remarks = "above agency-normalized standards";
		}else if(percentage < 80 && percentage >= 70){
			grade = "B";
			remarks = "at agency-normalized standards";
		}else if(percentage < 70 && percentage >= 60){
			grade = "C";
			remarks = "below, but approaching agency-normalized standards";
		}else if(percentage < 60 && percentage >= 50){
			grade = "D";
			remarks = "well below agency-normalized standards";
		}else if(percentage < 50 && percentage >= 40){
			grade = "E";
			remarks = "too bewlow agency-normalized standards";
		}else if(percentage < 80 && percentage >= 70){
			grade = "A";
			remarks = "at agency-normalized standards";
		}else{
			grade = "R";
			remarks = "Remedial standards";
		}

		
		System.out.println("The Average marks is :" + percentage + ", grade is :" + grade + " and remarks is : " + remarks);
		
		//close the Scanner
		sc.close();
	}
}