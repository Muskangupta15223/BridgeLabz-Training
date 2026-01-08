package com.TourMate;

public class InternationalTrip extends Trip {

	   public InternationalTrip(String destination, int duration,
               Transport transport, Hotel hotel, Activity activity) {
super(destination, duration, transport, hotel, activity);
}

@Override
public void book() {
System.out.println("International trip booked to " + destination);
System.out.println("Passport & visa required.");
System.out.println("Total Budget: ₹" + calculateTotalBudget());
}

@Override
public void cancel() {
System.out.println("International trip cancelled.");
}
}
