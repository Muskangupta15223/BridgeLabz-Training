import java.util.*;
public class MatrixOperation{
	//create method for matrix operations - creation, addition, subtraction, product

	public static double[][] createRandomMatrix(int r, int c){
		double matrix[][] = new double[r][c];
		Random ran = new Random();

		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				matrix[i][j] = ran.nextInt(100) + 1;
			}
		}
		return matrix;
	}

	public static void displayMatrix(double[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
				System.out.println();
		}
			System.out.println();
	}

	public static double[][] addMatrix(double[][] matrix1 , double[][] matrix2) {
		int rows = matrix1.length;
		int cols = matrix1[0].length;
		double[][] addition = new double[rows][cols];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				addition[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return addition;
	}

	public static double[][] subtractMatrix(double[][] matrix1 , double[][] matrix2) {
		int rows = matrix1.length;
		int cols = matrix1[0].length;
		double[][] sub = new double[rows][cols];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				sub[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		return sub;
	}

	public static double[][] productMatrix(double[][] matrix1 , double[][] matrix2) {
		int row1 = matrix1.length;
		int col1 = matrix1[0].length;
		int row2 = matrix2.length;
		int col2 = matrix2[0].length;
		double[][] product = new double[row1][col2];
		for(int i = 0; i < row1; i++){
			for(int j = 0; j < col2; j++){
				for(int k = 0; k < col1; k++){
					product[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return product;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// take input and display matrix
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		double[][] matrix1 = createRandomMatrix(row1, col1);
		displayMatrix(matrix1);
		double[][] matrix2 = createRandomMatrix(row1, col1);
 		displayMatrix(matrix2);
		int row3 = sc.nextInt();
		int col3 = sc.nextInt();
		double[][] matrix3 = createRandomMatrix(row3, col3);
		displayMatrix(matrix3);

		// perform operation and display output
		System.out.println("Addition of two matrix : ");
		displayMatrix(addMatrix(matrix1 , matrix2));
		System.out.println("Subtraction of two matrix : ");
		displayMatrix(subtractMatrix(matrix1 , matrix2));
		System.out.println("Product of two matrix : ");
		displayMatrix(productMatrix(matrix1 , matrix3));
	}
}