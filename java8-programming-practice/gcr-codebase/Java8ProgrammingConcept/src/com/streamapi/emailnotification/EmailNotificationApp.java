package com.streamapi.emailnotification;

import java.util.Arrays;
import java.util.List;

public class EmailNotificationApp {

	private static void sendEmailNotification(String email) {
		System.out.println("Notification email sent to: " + email);
	}
	
	public static void main(String[] args) {
		 List<String> emails = Arrays.asList(
	                "user1@gmail.com",
	                "user2@gmail.com",
	                "user3@gmail.com"
	     );

	   // forEach + lambda
	   emails.forEach(email -> sendEmailNotification(email));
	   }
}
