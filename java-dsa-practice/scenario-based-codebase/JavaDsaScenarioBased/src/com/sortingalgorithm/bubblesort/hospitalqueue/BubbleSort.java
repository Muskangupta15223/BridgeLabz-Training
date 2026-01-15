package com.sortingalgorithm.bubblesort.hospitalqueue;

public class BubbleSort {

	public void bubblesort(Patient [] patients) {
		int size = patients.length;
		for(int i = 0; i < size-1; i++) {
			for(int j = 0; j < size - i- 1; j++) {
				if(patients[j].criticality > patients[j+1].criticality) {
					Patient temp = patients[j];
					patients[j] = patients[j+1];
					patients[j+1] = temp;
					
				}
			}
		}
	}
}
