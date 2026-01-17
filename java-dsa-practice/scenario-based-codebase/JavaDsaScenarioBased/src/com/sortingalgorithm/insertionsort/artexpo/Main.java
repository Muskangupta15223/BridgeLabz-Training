package com.sortingalgorithm.insertionsort.artexpo;

public class Main {

	public static void main(String[] args) {
		
		Registration [] reg = new Registration[3];
		
		 reg[0] = new Registration("Muskan", "15:05");
		 reg[1]= new Registration("Soumya",  "09:55");
		 reg[2] = new Registration("Krishna", "13:01");
		 reg[3] = new Registration("Raghav", "18:20");
		 
		    InsertionSort.insertionsort(reg);

	        for (Registration r : reg) {
	            System.out.println(r.getName() + " - " + r.getTime());
	        }
	}

}
