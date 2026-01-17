package com.sortingalgorithm.bubblesort.cinemalhouse;

public class Main {

	public static void main(String[] args) {
		
		Movie movie[] = {
			  new Movie(" Dhurandhar " , "13:05"),
			  new Movie(" Padmavat " , "15:05"),
			  new Movie(" Mohabattein" , "05:05"),
			  new Movie(" RRR" , "05:05")
		};
		
		BubbleSort.bubblesortbytime(movie);
		
		for(Movie m : movie) {
			System.out.println(m.getName() + " | " + m.getTime());
		}

	}

}
