package com.sortingalgorithm.bubblesort.icecreamrush;

public class BubbleSort {

	public static void bubblesortbysold(IceCream[] ic) {
		int n = ic.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-1-i; j++) {
						
				if(ic[j].getSold() > ic[j+1].getSold()) {
					IceCream temp = ic[j+1];
					ic[j+1] = ic[j];
					ic[j] = temp;
				}
			}
		}
	}
}
