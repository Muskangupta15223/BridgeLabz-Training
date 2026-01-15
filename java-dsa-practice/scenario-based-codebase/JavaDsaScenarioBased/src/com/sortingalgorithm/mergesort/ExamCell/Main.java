package com.sortingalgorithm.mergesort.ExamCell;

public class Main {

	    public static void main(String[] args) {

	        ExamCenter c1 = new ExamCenter(1, "Center A");
	        ExamCenter c2 = new ExamCenter(2, "Center B");

	        c1.addStudent(new Student("Aman", 85, 1));
	        c1.addStudent(new Student("Riya", 92, 1));

	        c2.addStudent(new Student("Neha", 88, 2));
	        c2.addStudent(new Student( "Rahul", 95, 2));

	        RankGenerator rankGen = new RankGenerator();

	        // Merge pre-sorted center-wise scores
	        rankGen.addCenterScores(c1.getSortedScores());
	        rankGen.addCenterScores(c2.getSortedScores());

	        // State-level sorting
	        rankGen.generateRankList();

	        System.out.println("State-Level Rank List");
	        rankGen.displayRanks();
	    }
}
