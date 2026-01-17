package com.sortingalgorithm.insertionsort.artexpo;

import java.time.LocalTime;

public class InsertionSort {

	public static void insertionsort(Registration[] reg) {
		
		int n = reg.length;
		for(int i = 1; i < n; i++) {
		 Registration key = reg[i];
		LocalTime keyTime = LocalTime.parse(key.getTime());
			int j = i-1;
			
			while(j >= 0 && 
				LocalTime.parse(reg[j].getTime()).isAfter(keyTime)) {
				reg[j+1] = reg[j];
				j--;
			}
			reg[j+1] = key;
		}
	}	
}
