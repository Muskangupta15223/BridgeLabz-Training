package com.sortingalgorithm.insertionsort.movietime;

public class Movie {

	protected String name;
	protected String showTime;
	
	Movie(String name, String showTime){
		this.name= name;
		this.showTime = showTime;
	}

	public String getName() {
		return name;
	}

	public String getShowTime() {
		return showTime;
	}
}
