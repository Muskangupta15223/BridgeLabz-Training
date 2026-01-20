package com.sortingalgorithm.mergesort.foodfest;
import java.util.ArrayList;

public class FoodFest {

    public void mergeSort(ArrayList<Stall> stalls, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(stalls, left, mid);
            mergeSort(stalls, mid + 1, right);

            merge(stalls, left, mid, right);
        }
    }

    private void merge(ArrayList<Stall> stalls, int left, int mid, int right) {

        ArrayList<Stall> temp = new ArrayList<>();

        int i = left;
        int j = mid + 1;

        while (i <= mid && j <= right) {
            // Stable merge: keep original order if footfall is same
            if (stalls.get(i).footfall <= stalls.get(j).footfall) {
                temp.add(stalls.get(i++));
            } else {
                temp.add(stalls.get(j++));
            }
        }

        while (i <= mid) {
            temp.add(stalls.get(i++));
        }

        while (j <= right) {
            temp.add(stalls.get(j++));
        }

        for (int k = 0; k < temp.size(); k++) {
            stalls.set(left + k, temp.get(k));
        }
    }
}
