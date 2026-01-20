package com.sortingalgorithm.quicksort.gamerzone;

import java.util.ArrayList;

public class GamerZone {

    public void quickSort(ArrayList<Player> players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);

            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    private int partition(ArrayList<Player> players, int low, int high) {
        int pivot = players.get(high).score; // pivot score
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (players.get(j).score > pivot) { // descending order
                i++;
                swap(players, i, j);
            }
        }

        swap(players, i + 1, high);
        return i + 1;
    }

    private void swap(ArrayList<Player> players, int i, int j) {
        Player temp = players.get(i);
        players.set(i, players.get(j));
        players.set(j, temp);
    }
}

