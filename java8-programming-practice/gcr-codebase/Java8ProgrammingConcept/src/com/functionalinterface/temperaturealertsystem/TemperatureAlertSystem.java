package com.functionalinterface.temperaturealertsystem;

import java.util.function.Predicate;
import java.util.*;

public class TemperatureAlertSystem {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double threshold = 37.5;
		Predicate<Double> isHighTemperature = temp -> temp > threshold;
		System.out.println("Enter temperature");
		double currTemp = sc.nextDouble();
		System.out.println(isHighTemperature.test(currTemp)?
				"Alert!! High Temperature" : "Normal Temperature");
	}
}
