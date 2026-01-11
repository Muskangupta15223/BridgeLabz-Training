package com.runtimeanalysis.searching;

import java.util.Arrays;

public class SearchMain {

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        for (int n : sizes) {

            int[] data = new int[n];
            // Fill array
            for (int i = 0; i < n; i++) {
                data[i] = i;
            }

            int target = n - 1;
            // ---------- Linear Search ----------
            long startLinear = System.nanoTime();
            LinearSearch.linear(data, target);
            long endLinear = System.nanoTime();

            long linearTime = endLinear - startLinear;
            

            // ---------- Binary Search ----------
            Arrays.sort(data); 

            long startBinary = System.nanoTime();
            BinarySearch.binarySearch(data, target);
            long endBinary = System.nanoTime();

            long binaryTime = endBinary - startBinary;
            

            // ---------- Output ----------
            System.out.println("Dataset Size: " + n);
            System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
            System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");
            System.out.println("----------------------------------");
       
        }
    }
}
