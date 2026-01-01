import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    // Method to return elements of matrix in spiral order
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }

            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    result.add(matrix[endRow][j]);
                }
            }

            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
            }

            // Shrink boundaries
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        List<Integer> result = spiralOrder(matrix);
        System.out.println("Spiral Order: " + result);
    }
}
