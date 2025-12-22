import java.util.*;
public class MatrixOpt{

	public static double[][] createRandomMatrix(int r, int c){
		double matrix[][] = new double[r][c];
		Random ran = new Random();

		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				matrix[i][j] = ran.nextInt(9) + 1;
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


	public static double[][] transposeMatrix(double[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		double[][] transpose = new double[cols][rows];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				transpose[j][i] = (int)matrix[i][j];
			}
		}
		return transpose;
	}
	
	public static double determinant2x2(double[][] m) {
 		return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
	}

	public static double determinant3x3(double[][] m) {
		return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
			- m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
			+ m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
	}

	public static double[][] inverse2x2(double[][] m) {
		double det = determinant2x2(m);
		if (det == 0) return null;
			double[][] inv = new double[2][2];
			inv[0][0] = m[1][1] / det;
			inv[0][1] = -m[0][1] / det;
			inv[1][0] = -m[1][0] / det;
			inv[1][1] = m[0][0] / det;
		return inv;
	}
	
	    public static double[][] inverse3x3(double[][] m) {
		double det = determinant3x3(m);
			if (det == 0) return null;
			double[][] inv = new double[3][3];

			inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
			inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2]) / det;
			inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

			inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2]) / det;
			inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
			inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2]) / det;

			inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
			inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1]) / det;
			inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

		return inv;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		double[][] matrix2 = createRandomMatrix(2, 2);
		System.out.println("For 2x2 Matrix");
 		displayMatrix(matrix2);
		displayMatrix(transposeMatrix(matrix2));
		System.out.println("\nDeterminant: " + determinant2x2(matrix2));
		 double[][] inv2 = inverse2x2(matrix2);
		if (inv2 != null)
			displayMatrix(inv2);
		else
			System.out.println("Inverse not possible");

		System.out.println("For 3x3 Matrix");
		double[][] matrix3 = createRandomMatrix(3, 3);
		displayMatrix(matrix3);
		displayMatrix(transposeMatrix(matrix3));
		System.out.println("Determinant: " + determinant3x3(matrix3));
		double[][] inv3 = inverse3x3(matrix3);
		if (inv3 != null)
			displayMatrix(inv3);
		else
			System.out.println("Inverse not possible");
	}
}