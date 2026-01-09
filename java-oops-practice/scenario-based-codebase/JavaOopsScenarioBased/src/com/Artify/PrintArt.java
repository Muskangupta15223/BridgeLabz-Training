package com.Artify;

public class PrintArt extends Artwork{
	
	PrintArt(String title, String artistName, double price, String licenseType, boolean preview) {
		super(title, artistName, price, licenseType, preview);
	}
	
	 public void purchase(User u) {
		 double totalWallet =  u.getWalletBalance() - getPrice();
		 
		 if( totalWallet >= 0 ) {
			 u.updateWallet(getPrice());
			 System.out.println("Yes, you can purchase");
			 
		 } else {
			 System.out.println("You dont have enough balance!!!"); 
		 }
		 
	 }
}
