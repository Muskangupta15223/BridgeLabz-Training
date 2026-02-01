package com.streamapi.trendingmovie;

public class Movie {

	String name;
	private double rating;
	
	Movie(String name, double rating){
		this.name = name;
		this.rating = rating;
	}

	public double getRating() {
		return rating;
	}
	@Override
	public String toString() {
		return name + " | Rating: " + rating +"\n" ;
	}
}
