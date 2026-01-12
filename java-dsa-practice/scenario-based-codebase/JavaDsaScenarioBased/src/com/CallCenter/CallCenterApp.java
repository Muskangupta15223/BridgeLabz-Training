package com.CallCenter;

public class CallCenterApp {
			public static void main(String[] args) {

	        CallCenter center = new CallCenter();

	        center.receiveCall(new Customer("C101", "Krishna", false));
	        center.receiveCall(new Customer("C102", "Neha", true));
	        center.receiveCall(new Customer("C103", "Ravi", false));
	        center.receiveCall(new Customer("C102", "Soumya", true));

	        center.handleCall();
	        center.handleCall();
	        center.handleCall();
	        center.handleCall();
	    }
}
