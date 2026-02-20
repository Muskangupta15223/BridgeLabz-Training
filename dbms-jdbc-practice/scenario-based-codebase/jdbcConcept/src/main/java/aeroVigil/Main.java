package aeroVigil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InvalidFlightException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter flight details : ");
		String flight = sc.next();
		FlightUtil fl = new FlightUtil();
		
		String[] str = flight.split(":");
		if(fl.validateFlightName(str[1])) {
			if(fl.validateFlightNumber(str[0])) {
				if(fl.validatePassengerCount(Integer.parseInt(str[2]), str[1])) {
					System.out.println("Fuel required to fill the tank : "+(fl.calculateFuelToFillTank(str[1], Integer.parseInt(str[3])) < 0 ? "Invalid":(fl.calculateFuelToFillTank(str[1], Integer.parseInt(str[3])))));
				}else throw new InvalidFlightException("Invalid flight passenger count "+ str[2] + " for "+ str[1]);
			}else throw new InvalidFlightException("Invalid flight number "+ str[0]);
		}else throw new InvalidFlightException("Invalid flight name "+str[1]);
	}
}
