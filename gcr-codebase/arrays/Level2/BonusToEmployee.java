import java.util.Scanner;
// Create class BonusToEmployee to find bonus amount of employee
public class BonusToEmployee {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalBonus = 0;
		double totalOldSalary= 0;
		double totalNewSalary = 0;
		int numOfEmployee = 10;
		double[] salary = new double[numOfEmployee];
		double[] yearsOfService = new double[numOfEmployee];
		double[] newSalary = new double[numOfEmployee];
		double[] bonus = new double[numOfEmployee];


		//Take input of Employee and store in salary and yearsOfService array
		for(int i = 0; i < numOfEmployee; i++){
			System.out.println("Give me salary and yearOfService as input");
			salary[i] = sc.nextDouble();
			yearsOfService[i] = sc.nextDouble();
			if(salary[i] <= 0 || yearsOfService[i] <= 0){
				System.out.println("Invalid input!!. Enter valid input again");
				i--;	
			}
		}

		// calculate bonus amount, new salary and old salary of all employees
		for(int i = 0; i < numOfEmployee; i++){

			if(yearsOfService[i] >= 5){
				bonus[i] = (salary[i] * 5) / 100;
			}else if(yearsOfService[i] < 5 && yearsOfService[i] > 0 ){
				bonus[i] = (salary[i] * 2) / 100;				
			}

			newSalary[i] = salary[i] + bonus[i];
			totalBonus = totalBonus + bonus[i];
			totalNewSalary = totalNewSalary + newSalary[i];
			totalOldSalary = totalOldSalary + salary[i];;
		}

		// display the output
		System.out.println("The Total Bonus of Employee is : " + totalBonus);
		System.out.println("The Total New Salary of Employee is : " + totalNewSalary);
		System.out.println("The Total Old Salary of Employee is : " + totalOldSalary);

		//close the scanner
		sc.close();
	}
}