package com.streamapi.insuranceanalysis;

public class Insurance {

	   private String claimType;
	    private double claimAmount;

	    public Insurance(String claimType, double claimAmount) {
	        this.claimType = claimType;
	        this.claimAmount = claimAmount;
	    }

	    public String getClaimType() {
	        return claimType;
	    }

	    public double getClaimAmount() {
	        return claimAmount;
	    }
}
