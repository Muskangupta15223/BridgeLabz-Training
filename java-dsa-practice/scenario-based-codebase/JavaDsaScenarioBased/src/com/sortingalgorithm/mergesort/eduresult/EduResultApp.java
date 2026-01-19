package com.sortingalgorithm.mergesort.eduresult;

public class EduResultApp {

	public static void main(String[] args) {

		        // District 1 (already sorted)
		        Student[] d1 = {
		            new Student("Amit", 65),
		            new Student("Neha", 78),
		            new Student("Ravi", 90)
		        };

		        // District 2 (already sorted)
		        Student[] d2 = {
		            new Student("Pooja", 60),
		            new Student("Karan", 78),
		            new Student("Simran", 92)
		        };

		        District district1 = new District(d1);
		        District district2 = new District(d2);

		        // Merge district results
		        Student[] finalRank =
		                RankMerger.merge(district1.getStudents(), district2.getStudents());

		        System.out.println("State-wise Rank List:");
		        for (Student s : finalRank) {
		            System.out.println(s.getName() + " | " + s.getScore());
                }
	    }
  }
