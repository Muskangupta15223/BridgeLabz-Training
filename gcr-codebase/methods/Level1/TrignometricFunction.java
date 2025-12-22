import java.util.*;
public class TrignometricFunction {
	// create a method to calculate trigonometric functions
	public double[] calculateTrigonometricFunction(double angle){
		double rad = Math.toRadians(angle);
		double[] func = new double[3];
			func[0] = Math.sin(rad);
			func[1] = Math.cos(rad);
			func[2] = Math.tan(rad);
		return func;
	}

	public static void main(String args[]){
		// Taking angle as input from user
		Scanner sc = new Scanner(System.in);
		double angle = sc.nextDouble(); 
		
		TrignometricFunction tf = new TrignometricFunction();
		double[] values = tf.calculateTrigonometricFunction(angle);
		System.out.println("Sine = " + values[0] + " Cosine = " + values[1] + " Tan = " + values[2]);		
	}
}