package com.sortingalgorithm.mergesort.ZipZipMart;

public class Main {

	public static void main(String[] args) {
		
        Transaction[] sales = {
                new Transaction("2026-01-10", 500),
                new Transaction("2026-01-08", 300),
                new Transaction("2026-01-10", 200),
                new Transaction("2026-01-09", 400)
            };
        MergeSort.mergesort(sales, 0, sales.length-1);
        
        System.out.println("Sorted Sales Report:");
        for (Transaction t : sales) {
            System.out.println(t.getDate() + " - ₹" + t.getAmount());
        }
	}

}
