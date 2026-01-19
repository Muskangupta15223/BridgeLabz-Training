package com.sortingalgorithm.quicksort.flashdealz;

public class FlashDealzApp {

	public static void main(String args[]) {
		
		Product p[] = {
				 new Product("Detergent" , 12),
				 new Product("Soap" , 52),
				 new Product("Toothpaste" , 22),
				 new Product("lizal" , 32)
		};
		for(Product product : p) {
			System.out.println(product.getName() + " | " + product.getDiscount());
		}
		QuickSort.quicksortdiscount(p, 0, p.length-1);
		System.out.println("==================");
		for(Product product : p) {
			System.out.println(product.getName() + " | " + product.getDiscount() + "% discount");
		}
	}
}
