package com.sortingalgorithm.eventmanager;

public class QuickSort {

	public static void quicksort(Ticket[] arr, int low, int high) {
		
		if(low < high) {
			int pivotIdx = partition(arr, low, high);
			
			quicksort(arr, low, pivotIdx - 1);
			quicksort(arr, pivotIdx+1, high);
		}
	}
    
	private static int partition(Ticket[] arr, int low, int high) {
    		
		int pivot = arr[high].getPrice();
		int i = low-1;
		
		for(int j = low; j < high; j++) {
			if( arr[j].getPrice() <= pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr, i+1,high);
		return i+1;
	}
	    private static void swap(Ticket[] arr, int i, int j) {
	        Ticket temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	}
