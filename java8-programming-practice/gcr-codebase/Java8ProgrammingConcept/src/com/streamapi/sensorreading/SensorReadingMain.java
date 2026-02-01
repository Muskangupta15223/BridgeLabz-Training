package com.streamapi.sensorreading;

import java.util.Arrays;
import java.util.List;

public class SensorReadingMain {

	public static void main(String[] args) {
	
		double threshold = 24.0;
		List<Double>readings = Arrays.asList(23.5, 25.0, 26.8, 24.1, 26.3, 21.9);
		
		readings.stream().filter(reading -> reading > threshold)
			   .forEach(reading -> System.out.println("High sensor reading: " + reading));
		
	}
}
