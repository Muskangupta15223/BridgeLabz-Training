import java.util.*;
public class BMICalculator{
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
	public static String[][] computeBMI(double[] weight ,double[] height, int n) {
		String[][] result = new String[n][4];
		for (int i = 0; i < n; i++) {
            		double bmi = calculateBMI(weight[i], height[i]);
            		String status = getBMIStatus(bmi);

            		result[i][0] = String.valueOf(height[i]);
            		result[i][1] = String.valueOf(weight[i]);
            		result[i][2] = String.format("%.2f", bmi);
            		result[i][3] = status;
        	}

        	return result;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number of people ");
		int numOfPeople = sc.nextInt();
		double[] height = new double[numOfPeople];
		double[] weight = new double[numOfPeople];

		for(int i = 0; i < numOfPeople; i++){
		System.out.println("Enter weight and height: ");
			weight[i] = sc.nextDouble();
			height[i] = sc.nextDouble();	
		}
		
        String[][] result = computeBMI(weight,height, numOfPeople);
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