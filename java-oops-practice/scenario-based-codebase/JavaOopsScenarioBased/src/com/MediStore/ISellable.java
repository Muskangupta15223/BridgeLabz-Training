package com.MediStore;

public interface ISellable {
	
	double sell(int qty);
	boolean checkExpiry(String curr);
}
