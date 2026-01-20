package com.sortingalgorithm.insertionsort.movietime;
import java.time.LocalTime;
import java.util.*;

public class MovieTime {

	public static void insertionSort(ArrayList<Movie>m){
		for(int i = 1; i < m.size(); i++) {
			Movie key = m.get(i);
			int j = i -1;
			LocalTime keytime = LocalTime.parse(key.showTime);
			LocalTime time = LocalTime.parse(m.get(j).showTime);
			while( j >= 0 &&   time.isAfter(keytime)) {
				m.set(j + 1,  m.get(j));
				j--;
			}
			m.set(j+1,  key);
		}
	}
}
