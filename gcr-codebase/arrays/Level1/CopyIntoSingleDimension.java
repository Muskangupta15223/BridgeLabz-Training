import java.util.Scanner;
// Create class to convert 2D array into 1D
public class CopyIntoSingleDimension {
    public static void main(String[] args) {
	// Take rows and columns input
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        // Create 2D array (matrix)
        int[][] matrix = new int[rows][columns];

        // Take elements input in 2d matrix format
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create 1D array of size rows * columns
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy 2D array elements to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display singleD array
        System.out.println("1D Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
