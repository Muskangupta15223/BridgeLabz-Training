package com.streamapi.trendingmovie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MoviesMain {

	public static void main(String args[]) {
		List<Movie> movies = Arrays.asList(
				new Movie("Prem", 2.8),
				new Movie("Zingat", 3.8),
				new Movie("Dhurandar", 4.3),
				new Movie("12thFail", 3.5),
				new Movie("Border", 2.9),
				new Movie("Dune", 2.4),
	            new Movie("Oppenheimer", 4.9),
	            new Movie("Tenet", 2.8),
	            new Movie("Avatar", 4.8)
				);
		List<Movie>topmovies=movies.stream()
			  .filter( movie -> movie.getRating() >= 3.5)
			  .sorted(Comparator.comparing(Movie :: getRating).reversed())
			  .limit(5)
			  .collect(Collectors.toList());
			System.out.println(topmovies);
	}
}
