package com.TourMate;

public class Main {

	    public static void main(String[] args) {

	        Transport transport = new Transport(15000);
	        Hotel hotel = new Hotel(20000);
	        Activity activity = new Activity(5000);

	        IBookable domesticTrip = new DomesticTrip(
	                "Goa", 5, transport, hotel, activity);

	        IBookable internationalTrip = new InternationalTrip(
	                "Paris", 7, transport, hotel, activity);

	        domesticTrip.book();
	        System.out.println("--------------------");
	        internationalTrip.book();
	    }
	}

