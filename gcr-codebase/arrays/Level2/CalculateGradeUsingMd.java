import java.util.*;
//Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade using 2D arrays.
// taking input from the user
public class CalculateGradeUsingMd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int size = sc.nextInt();

        int[][] marks = new int[size][4];
        String[] grades = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();

            // Calculate percentage
            marks[i][3] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            int m = marks[i][3];

            // Grade calculation
            if (m >= 80 && m <= 100) {
                grades[i] = "Level 4, above agency-normalized standards";
            } else if (m >= 70) {
                grades[i] = "Level 3, at agency-normalized standards";
            } else if (m >= 60) {
                grades[i] = "Level 2, below but approaching standards";
            } else if (m >= 50) {
                grades[i] = "Level 1, well below standards";
            } else if (m >= 40) {
                grades[i] = "Level 1, too below standards";
            } else {
                grades[i] = "Remedial Standards";
            }
        }

        // Display Output
        System.out.println("/n Grades: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Student " + (i + 1) +" | Percentage = " + marks[i][3] +" | Grade = " + grades[i]);
        }
	//close the scanner
        sc.close();
    }
}