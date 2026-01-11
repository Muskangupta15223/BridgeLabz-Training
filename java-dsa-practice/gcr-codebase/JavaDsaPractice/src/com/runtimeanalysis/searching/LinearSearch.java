package com.runtimeanalysis.searching;

public class LinearSearch {
	
	public static boolean linear(int arr[], int target) {
		for(int i =0; i < arr.length; i++) {
			if(arr[i] == target) {
				return true;
			}
		}
		return false;
	}

	
}
