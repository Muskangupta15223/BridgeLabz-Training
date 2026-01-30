package com.lambdaexpression.notificationfiltering;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NotificationFiltering {

	public static void main(String args[]) {
		
		List<String>alerts = Arrays.asList(
				"Emergency",
				"Appointment",
				"Medicine Reminder",
				"Promotion"
		);
		
		
        Predicate<String> emergencyAndMedicine =
                alert -> alert.equalsIgnoreCase("Emergency") || 
                		alert.equalsIgnoreCase("Medicine Reminder");

        alerts.stream().filter(emergencyAndMedicine)
              .forEach(System.out::println);
    }
}
