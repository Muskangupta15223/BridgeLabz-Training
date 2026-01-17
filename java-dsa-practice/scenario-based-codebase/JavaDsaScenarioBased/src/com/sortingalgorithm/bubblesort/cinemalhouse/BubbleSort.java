package com.sortingalgorithm.bubblesort.cinemalhouse;

import java.time.LocalTime;

public class BubbleSort {

	public static void bubblesortbytime(Movie[] m) {
		int n = m.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				Movie time = m[j];
				LocalTime timekey1 = LocalTime.parse(time.getTime());
				LocalTime timekey2 = LocalTime.parse(m[j+1].getTime());
				if( timekey2.isAfter(timekey1)) {
					LocalTime temp =  timekey2;
					timekey2 = timekey1;
					timekey1 = temp;
				}
			}
		}
	}
	
}
