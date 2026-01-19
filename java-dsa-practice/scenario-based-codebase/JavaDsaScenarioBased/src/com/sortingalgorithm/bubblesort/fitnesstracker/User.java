package com.sortingalgorithm.bubblesort.fitnesstracker;

public class User {

	private String username;
	private int steps;
	
	User(String username, int steps){
		this.username = username;
		this.steps = steps;
	}

	public String getUsername() {
		return username;
	}

	public int getSteps() {
		return steps;
	}
}
