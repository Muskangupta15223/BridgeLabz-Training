package com.traincompanion;

public class Main {
	  public static void main(String[] args) {

	        TrainCompanion train = new TrainCompanion();

	        train.addCompartment("Engine");
	        train.addCompartment("Sleeper");
	        train.addCompartment("Pantry");
	        train.addCompartment("AC");
	        train.addCompartment("WiFi");

	        train.traverseForward();
	        train.traverseBackward();

	        train.showAdjacent("Pantry");

	        train.removeCompartment("Sleeper");
	        train.traverseForward();
	    }
}
