import java.util.Scanner;

public class StudentVote {

    // Method to create age array of n students
    public static int[] createAgeArray(int n, Scanner sc) {
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]); // Age column

            if (ages[i] < 0) {
                result[i][1] = "false"; // Invalid age
            } else if (ages[i] >= 18) {
                result[i][1] = "true";  // Can vote
            } else {
                result[i][1] = "false"; // Cannot vote
            }
        }
        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfStudents = 10;

        int[] ages = createAgeArray(numberOfStudents, sc);
        String[][] result = checkVotingEligibility(ages);
        displayResult(result);

        sc.close();
    }
}
