import java.util.*;
public class ShowScorecard{
	// create method where column 1 contains physics marks, 2 contains chemistry marks, and 3 contains Maths marks
	public static double[][] generateScores(int n){
	double scores[][] = new double[n][3];
	Random r = new Random();
		for(int i = 0; i < n; i++){ 
			scores[i][0] = r.nextInt(99) + 1;
			scores[i][1] = r.nextInt(99) + 1;
			scores[i][2]= r.nextInt(99) + 1;
		}
		return scores;
	}
	public static double[][] calculateAverage(int n, double[][] marks){
		double result[][] = new double[n][3];
		double total = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < 3; j++){
				total += marks[i][j];
			}
			result[i][0] = total;
			result[i][1] = Math.round(total / 3);
			result[i][2] = Math.round(total / (3 * 100)  * 100);
		}
		return result;
	}
	public static String[][] calculateGrade(int n, double[][] result){
		String grades[][] = new String[n][1]; 
		for(int i = 0; i < n; i++){
			if (result[i][2] >= 80 && result[i][2] <= 100) {
                		grades[i][0] = "Level 4, above agency-normalized standards";
            		} else if (result[i][2] >= 70) {
                		grades[i][0] = "Level 3, at agency-normalized standards";
            		} else if (result[i][2] >= 60) {
                		grades[i][0] = "Level 2, below but approaching standards";
            		} else if (result[i][2] >= 50) {
                		grades[i][0] = "Level 1, well below standards";
            		} else if (result[i][2] >= 40) {
            	   	 	grades[i][0] = "Level 1, too below standards";
           		} else {
                		grades[i][0] = "Remedial Standards";
            		}
		}
		return grades;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Give num of students");
		int numOfStudent = sc.nextInt();
		System.out.println("Scorecard : ");
		double[][] marks = generateScores(numOfStudent);
		double result[][] = calculateAverage(numOfStudent , marks);
		String grades[][]= calculateGrade(numOfStudent , result);
		for(int i = 0; i < numOfStudent; i++){
		System.out.println("The scorecard of student" + (i+1) + " : scores in physics " + marks[i][0] + ", chemistry " + marks[i][1] + ",and maths " + marks[i][2]);
		System.out.println("	The total of  student" + i+1 + " is " + result[i][0]+", average is " + result[i][1] + ", percentage is " + result[i][2] +", and grade is " +grades[i][0]);
		}
	}
}