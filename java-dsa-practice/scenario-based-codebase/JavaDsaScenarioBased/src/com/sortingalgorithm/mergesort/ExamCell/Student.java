package com.sortingalgorithm.mergesort.ExamCell;

public class Student {

	private String name;
	private int score;
	private int centerId;
	
	Student(String name, int score, int centerId ){
		this.name = name;
		this.score = score;
		this.centerId = centerId;
	}

	public int getCenterId() {
		return centerId;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}
	
}
