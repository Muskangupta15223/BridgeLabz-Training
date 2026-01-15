package com.sortingalgorithm.mergesort.ExamCell;

import java.util.*;

public class RankGenerator {
	
	private List<Student>allStudents = new ArrayList<>();
	
	  public void addCenterScores(List<Student> centerScores) {
	        allStudents.addAll(centerScores);
	    }

	    public List<Student> generateRankList() {
	        MergeSort.mergeSort(allStudents, 0, allStudents.size() - 1);
	        return allStudents;
	    }

	    public void displayRanks() {
	        int rank = 1;
	        for (Student s : allStudents) {
	            System.out.println(rank++ + ". " + s.getName() +
	                    "  | Score: " + s.getScore()  + "  | center: " + s.getCenterId());
	        }
	    }
	}
