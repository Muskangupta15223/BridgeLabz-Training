package factoryRobotHazard;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the armPrecision(0.0-1.0) : ");
		double armPrecision = sc.nextDouble();
		System.out.print("Enter the workerDensity(1-20) : ");
		int workerDensity = sc.nextInt();
		System.out.print("Enter the machineryState(Worn/Faulty/Critical) : ");
		String machineryState = sc.next();

		RobotHazardAuditor chr = new RobotHazardAuditor();
		try {
			System.out.println(
					"Robot Hazard Risk Score: " + chr.CalculateHazardRisk(armPrecision, workerDensity, machineryState));
		} catch (RobotSafetyException e) {
			System.out.println(e.getMessage());
		}

	}

}
