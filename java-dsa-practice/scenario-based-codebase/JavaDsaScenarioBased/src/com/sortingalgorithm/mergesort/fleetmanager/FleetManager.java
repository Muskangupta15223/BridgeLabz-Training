package com.sortingalgorithm.mergesort.fleetmanager;
import java.util.*;

class FleetManager {

    public static List<Vehicle> mergeLists(List<Vehicle> list1, List<Vehicle> list2) {
        List<Vehicle> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).mileage <= list2.get(j).mileage) {
                merged.add(list1.get(i++));
            } else {
                merged.add(list2.get(j++));
            }
        }

        while (i < list1.size()) merged.add(list1.get(i++));
        while (j < list2.size()) merged.add(list2.get(j++));

        return merged;
    }
}

