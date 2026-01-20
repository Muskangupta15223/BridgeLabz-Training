package com.sortingalgorithm.insertionsort.movietime;
import java.util.*;
public class MovieApp {

	public static void main(String args[]) {
		ArrayList<Movie>movie = new ArrayList<>();
				movie.add( new Movie("Prem Ratan Dhan Payo", "13:05"));
				movie.add(new Movie("Dhurandhar", "15:05"));
				movie.add(new Movie("Genius", "09:05"));
				movie.add(new Movie("Ashiqui", "11:05"));
				movie.add(new Movie("Jawan", "21:05"));
	
				MovieTime.insertionSort(movie);
				for(Movie m : movie) {
					System.out.println(m.name + "|" + m.showTime);
				}
		
	}
}
