package com.ambulanceroute;

public class HospitalApp {
		 public static void main(String[] args) {

		     AmbulanceRoute route = new AmbulanceRoute();

		     route.addUnit("Emergency", false);
		     route.addUnit("Radiology", false);
		     route.addUnit("Surgery", true);
		     route.addUnit("ICU", true);

		     route.displayRoute();
		     route.routePatient();
		     route.removeUnit("Radiology");
		     route.displayRoute();
		     route.routePatient();
	  }
 }

