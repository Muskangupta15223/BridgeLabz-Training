package com.constructors.levelone;

public class HotelBooking {
	String guestName;
	String roomType;
	int nights;
	
	// default constructors
	HotelBooking(){
		guestName = "abc";
		roomType = "non-ac";
		nights = 1;

	}
	// parametrized constructor
	HotelBooking(String g, String r, int n){
		guestName = g;
		roomType = r;
		nights = n;
	}
	// copy- constructor
	HotelBooking( HotelBooking h){
		guestName = h.guestName;
		roomType = h.roomType;
		nights = h.nights;
	}
	void display() {
        System.out.println("guest name is : " + guestName + 
        					"\t room type is :" + roomType +
        					" \t the total night stay is :" + nights);
    }
	 public static void main(String[] args) {
		 HotelBooking hb = new HotelBooking();
		 hb.display();
		 
		 HotelBooking hb1 = new HotelBooking("Muskan","ac",3);
		 hb1.display();
		 
		 HotelBooking hb2 = new HotelBooking(hb);
		 hb2.display();
	    }
}
