package com.sortingalgorithm.insertionsort.tailorshop;

import java.time.LocalTime;
import java.util.ArrayList;

public class InsertionSort {

	public static void insertionSort(ArrayList<Clothes> list) {
		
		for(int i = 1; i < list.size(); i++) {
			int j = i - 1;
			Clothes key = list.get(i); 
			LocalTime keyTime = LocalTime.parse(key.deliverytime);
			while(j >= 0 && LocalTime.parse(list.get(j ).deliverytime).isAfter(keyTime)) {
					list.set(j + 1,  list.get(j));
					j --;
			}
			list.set(j+1, key);
		}
	}
}
