import java.util.Scanner;
// Create class FindBMIOfPerson to find the BMI, and weight status using multi dimesional array
public class  FindBMIOfPersonUsingMd{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	 	double[][] personData = new double[num][3];
		String[] weightStatus = new String[num];

		for(int i = 0; i < num; i++){
			System.out.println("Give me height and weight of a person");
			for(int j = 0; j < 2; j++){
				personData[i][j] = sc.nextInt();

				if(personData[i][j] <= 0 ){
					System.out.println("Enter only positive value height and weight of a person");
					j--;	
				}
			}
		}

		for(int i = 0; i < num; i++){

			personData[i][0] = personData[i][0]/ 100;
			personData[i][2] = personData[i][1] / (personData[i][0]* personData[i][0]);		
			
			if(personData[i][2] >= 40){
				weightStatus[i] = "Obese";
			}else if(personData[i][2] >= 25 && personData[i][2]< 40){
				weightStatus[i]= "Overweight";
			}else if(personData[i][2]>= 18.5 && personData[i][2]< 25){
				weightStatus[i] = "Normal";
			}else{
				weightStatus[i] = "Underweight";
			}
		}

		//display output
		for(int i = 0; i < num; i++){
			System.out.println("The height is " + personData[i][0]* 100 + ", weight is " +personData[i][1]+", BMI is " + personData[i][2] + " and weight status of person is : " + weightStatus[i]);
		}
		//close the Scanner
		sc.close();
	}
}