package com.sortingalgorithm.quicksort.cropmonitor;

public class QuickSortSensor {

    public static void quickSort(SensorData[] arr, int low, int high) {

        if (low < high) {
            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);     // Left sub-array
            quickSort(arr, p + 1, high);    // Right sub-array
        }
    }

    private static int partition(SensorData[] arr, int low, int high) {

        SensorData pivot = arr[low]; // FIRST element as pivot
        int i = low + 1;
        int j = high;

        while (i <= j) {

            // Move i forward while timestamp <= pivot
            while (i <= high && arr[i].timestamp.isBefore(pivot.timestamp)) {
                i++;
            }

            // Move j backward while timestamp > pivot
            while (arr[j].timestamp.isAfter(pivot.timestamp)) {
                j--;
            }

            if (i < j) {
                SensorData temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        SensorData temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; // pivot index
    }
}

