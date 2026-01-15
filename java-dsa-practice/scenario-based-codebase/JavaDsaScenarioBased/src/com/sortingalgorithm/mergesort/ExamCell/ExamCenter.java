package com.sortingalgorithm.mergesort.ExamCell;
import java.util.*;
public class ExamCenter {

	private int centerId;
	private String centerName;
	protected List<Student> students;
	
	ExamCenter(int centerId,String centerName){
		this.centerId = centerId;
		this.centerName = centerName;
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public List<Student> getSortedScores(){
        List<Student> sortedList = new ArrayList<>(students);
        MergeSort.mergeSort(sortedList, 0, sortedList.size() - 1);
		return sortedList;
	}

}
