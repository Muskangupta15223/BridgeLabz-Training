package com.Artify;

public abstract class Artwork implements IPurchasable{

	private String title;
	protected String artistName;
	private double price;
	private String licenseType;
	protected boolean preview;
	
	Artwork(String title, String artistName, double price, String licenseType, boolean preview){
		this.title = title;
		this.artistName = artistName;
		this.price = price;
		this.licenseType = licenseType;	
		this.preview = preview;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public String getLicenseType() {
		return licenseType;
	}
	
	public void displayInfo() {
		System.out.println("Name :" + title);
		System.out.println("Price :" + price);
		System.out.println("Artist name : " + artistName);
		System.out.println("License type: "+ licenseType);
	}
	
	 public abstract void purchase(User u);	
	
}
