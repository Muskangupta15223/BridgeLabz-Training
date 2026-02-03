package com.workshop.smartcitymanagementsystem;
import java.util.*;

interface GeoUtils {
    static double calculateDistance(String from, String to) {
        // Dummy distance calculation
        return new Random().nextInt(20) + 1;
    }
}
