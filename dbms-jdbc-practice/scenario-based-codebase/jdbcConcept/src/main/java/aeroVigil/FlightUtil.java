package aeroVigil;

import java.util.Set;

public class FlightUtil {
	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
		String regex = "^FL-(1000|[0-9]|9000){4}$";
		if (flightNumber.matches(regex)) {
			return true;
		} else {
			throw new InvalidFlightException("The flight number " + flightNumber + "is invalid");
		}
	}

	public boolean validateFlightName(String flightName) throws InvalidFlightException {
		Set<String> s = Set.of("SpiceJet", "Vistara", "IndiGo", "Air Arabia");
		if (s.contains(flightName)) {
			return s.contains(flightName);
		} else {
			throw new InvalidFlightException("The flight name " + flightName + " is invalid");
		}
	}

	public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException {
		switch (flightName) {
		case "SpiceJet":
			if (passengerCount <= 396)
				return true;
			break;

		case "Vistara":
			if (passengerCount <= 615)
				return true;
			break;

		case "IndiGo":
			if (passengerCount <= 230)
				return true;
			break;

		case "Air Arabia":
			if (passengerCount <= 130)
				return true;
			break;

		default:
			throw new InvalidFlightException("The passenger count " + passengerCount + " is invalid for " + flightName);
		}
		return false;

	}

	public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
		switch (flightName) {
		case "SpiceJet":
			return 200000-currentFuelLevel;
		case "Vistara":
			return 300000-currentFuelLevel;
		case "IndiGo":
			return 250000-currentFuelLevel;
		case "Air Arabia":
			return 150000-currentFuelLevel;
		default:
			throw new InvalidFlightException("Invalid fuel level for " + flightName);
		}

	}
}
