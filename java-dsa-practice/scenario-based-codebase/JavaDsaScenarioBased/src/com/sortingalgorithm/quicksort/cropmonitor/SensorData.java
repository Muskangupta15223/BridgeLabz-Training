package com.sortingalgorithm.quicksort.cropmonitor;

import java.time.LocalDateTime;

public class SensorData {

	double temperature;
	LocalDateTime timestamp;
	
	public SensorData(double temperature, LocalDateTime timestamp) {
		this.temperature = temperature;
		this.timestamp = timestamp;
	}
    public void display() {
        System.out.println("Time: " + timestamp + " | Temperature: " + temperature + "°C");
    }
}
