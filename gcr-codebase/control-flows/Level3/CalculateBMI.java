import java.util.*;
// create class CalculateBMI to calculate BMI of a person
public class CalculateBMI{
	public static void main(String args[]){ 	
		//Taking height and weight as input from user
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		String status ;
		
		//convert height into meter and calculate BMI
		height = height / 100;
		double BMI = weight / ( height * height );

		// calculate status using conditions		
		if(BMI >= 40){
			status = "Obese";
		}else if(BMI >= 25 && BMI < 40){
			status = "Overweight";
		}else if(BMI >= 18.5 && BMI < 25){
			status = "Normal";
		}else{
			status = "Underweight";
		}

		//display output
		System.out.println("The status of person is : " + status);
		
		//close the Scanner
		sc.close();
	}
}