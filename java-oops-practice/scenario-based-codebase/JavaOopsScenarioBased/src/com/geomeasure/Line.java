package com.geomeasure;

public class Line {

	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	Line(int x1,int x2,int y1,int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	   public double calculateLength() {
	        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	    }
}
