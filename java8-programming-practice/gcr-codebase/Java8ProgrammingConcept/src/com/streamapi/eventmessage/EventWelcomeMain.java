package com.streamapi.eventmessage;

import java.util.Arrays;
import java.util.List;

public class EventWelcomeMain {

	private static void welcomeMessage(String attendee) {
		System.out.println("Welcome to the Event, " + attendee + "!");
	}
	
	public static void main(String[] args) {
		
		List<String> attendees = Arrays.asList(
		"Muskan", "Amit", "Ragini", "Karan",
		"Afroz", "Raghav", "Piyush", "Krishna");
		attendees.stream().forEach(attendee -> welcomeMessage(attendee));;
	}


}
