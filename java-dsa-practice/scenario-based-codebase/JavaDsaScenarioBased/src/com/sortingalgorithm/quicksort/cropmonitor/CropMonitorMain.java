package com.sortingalgorithm.quicksort.cropmonitor;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CropMonitorMain {

	public static void main(String args[]) {
		
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter number of sensor readings:");
	        int n = sc.nextInt();

	        SensorData[] data = new SensorData[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nReading " + (i + 1));

	            System.out.println("Enter temperature:");
	            double temp = sc.nextDouble();
	            sc.nextLine(); // clear buffer

	            System.out.println("Enter timestamp (yyyy-MM-ddTHH:mm):");
	            String time = sc.nextLine();

	            LocalDateTime timestamp = LocalDateTime.parse(time);
	            data[i] = new SensorData(temp, timestamp);
	        }

	        System.out.println("\n--- Unsorted Sensor Data ---");
	        for (SensorData s : data) {
	            s.display();
	        }

	        QuickSortSensor.quickSort(data, 0, n - 1);

	        System.out.println("\n--- Sensor Data Sorted by Timestamp ---");
	        for (SensorData s : data) {
	            s.display();
	        }
	        sc.close();
	}
}
