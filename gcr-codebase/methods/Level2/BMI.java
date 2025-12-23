import java.util.*;
public class BMI{
	  public static double calculateBMI(double weightKg, double heightCm) {
        double heightMeter = heightCm / 100; // convert cm to meter
        return weightKg / (heightMeter * heightMeter);
    }
	public static String getBMIStatus(double bmi) {
		if (bmi <= 18.4) {
            	return "Underweight";
        	} else if (bmi >= 18.5 && bmi <= 24.9) {
            	return "Normal";
        	} else if (bmi >= 25.0 && bmi <= 39.9) {
            	return "Overweight";
        	} else {
            	return "Obese";
        	}
    	}
	public static String[][] computeBMI(double[][] data) {
        	String[][] result = new String[10][4];

		for (int i = 0; i < 10; i++) {
            		double weight = data[i][0];
            		double height = data[i][1];

            		double bmi = calculateBMI(weight, height);
            		String status = getBMIStatus(bmi);

            		result[i][0] = String.valueOf(height);
            		result[i][1] = String.valueOf(weight);
            		result[i][2] = String.format("%.2f", bmi);
            		result[i][3] = status;
        	}

        	return result;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int r = 10;
		int c = 3;
		double[][] person = new double[r][c];
		
		for(int i = 0; i < person.length; i++){
			System.out.println("Give me weight and height  input ");
			for(int j = 0; j < 2; j++){
				person[i][j] = sc.nextDouble();	
			}
		}
		
        String[][] result = computeBMI(person);
		for(int i = 0; i < result.length; i++){
			System.out.println( (i + 1) + "\t" +
                    		result[i][0] + "\t\t" +
                    		result[i][1] + "\t\t" +
                    		result[i][2] + "\t\t" +
                    		result[i][3]
			);
		}
	}
}