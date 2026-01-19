package com.sortingalgorithm.quicksort.flashdealz;

public class QuickSort {

	public static void quicksortdiscount(Product p[], int low, int high){
		
		if(low < high) {
			int piv = partition(p, low, high);
			quicksortdiscount(p, low, piv-1);
			quicksortdiscount(p, piv + 1, high);
		}
	}
	public static void swap(Product []p, int i, int j) {
		Product temp = p[i];
		p[i] = p[j];
		p[j] = temp;
	}
	private static int partition(Product[] p, int low, int high) {
	   int pivot = p[high].getDiscount();
	   int i = low -1;
	   for(int j = low; j <= high -1; j++) {
		   if( p[j].getDiscount() > pivot) {
			   i++;
			   swap(p, i, j);
		  }
	   }
	   swap(p, i+1, high);
	   return i+1;
	}
}
