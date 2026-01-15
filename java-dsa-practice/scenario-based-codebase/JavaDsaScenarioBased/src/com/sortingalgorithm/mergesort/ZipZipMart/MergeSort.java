package com.sortingalgorithm.mergesort.ZipZipMart;

public class MergeSort {

		public static void mergesort(Transaction[] sales, int l, int r ) {
		
			if(l < r) {
				int m = (l + r ) / 2;
			
				mergesort(sales, l, m);
				mergesort(sales, m+1, r);
			
				merge(sales, l, m, r);
			}
		}
	
		public static void merge(Transaction[] sales, int l, int m, int r) {
		
			int n1 = m - l + 1;
			int n2 = r -m;
			
	        Transaction[] L = new Transaction[n1];
	        Transaction[] R = new Transaction[n2];
	        
	        for(int i = 0; i < n1; i++) 
	        	L[i] = sales[l+i];
	        for(int j = 0; j < n2; j++) 
	        	R[j] = sales[m+1+j];	
		
	        int i = 0, j = 0, k = l;
	        
	        while(i < n1 && j < n2) {
	        	if(L[i].getDate().compareTo(R[j].getDate()) < 0 ||
	        	   L[i].getDate().compareTo(R[j].getDate()) == 0 && 
	        	   L[i].getAmount() <= R[j].getAmount() ) {
	        		sales[k] = L[i];
	        		i++;
	        	}else {
	        		sales[k] = R[j];
	        		j++;
	           	}
	        	k++;
	        }
	        while (i < n1) {
	            sales[k++] = L[i++];
	        }

	        while (j < n2) {
	            sales[k++] = R[j++];
	        }
	  }
}
