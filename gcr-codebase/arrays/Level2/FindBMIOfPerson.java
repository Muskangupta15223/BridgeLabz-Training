import java.util.Scanner;
// Create a class FindBMIOfPerson to find the BMI, and weight status
public class  FindBMIOfPerson{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double[] height = new double[num];
		double[] weight = new double[num];
		String[] weightStatus = new String[num];
		double[] BMI = new double[num];	

		// take height and weight as a input
		for(int i = 0; i < num; i++){
			System.out.println("Give me height and weight of a person");
			height[i] = sc.nextInt();
			weight[i] = sc.nextInt();
		}
		for(int i = 0; i < num; i++){
			height[i] = height[i] / 100;
			BMI[i] = weight[i] / (height[i] * height[i]);
			// Calculate BMI and weight status
			if(BMI[i] >= 40){
				weightStatus[i] = "Obese";
			}else if(BMI[i] >= 25 && BMI[i]< 40){
				weightStatus[i]= "Overweight";
			}else if(BMI[i]>= 18.5 && BMI[i]< 25){
				weightStatus[i] = "Normal";
			}else{
				weightStatus[i] = "Underweight";
			}
		}

		//display output
		for(int i = 0; i < num; i++){
			System.out.println("The height is " + height[i] + ", weight is " +weight[i] +", BMI is " + BMI[i] + " and weight status of person is : " + weightStatus[i]);
		}
		//close the Scanner
		sc.close();
	}
}