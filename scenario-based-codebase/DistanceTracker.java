/* 19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation. */

import java.util.Scanner;

public class DistanceTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDistance = 0;
        boolean continueRide = true;

        while (continueRide) {
            System.out.println("Enter the distance to the next stop:");
            int distance = sc.nextInt();
            totalDistance += distance;
            System.out.println("Total distance traveled so far: " + totalDistance);

            System.out.println("Do you want to get off at this stop? (yes/no)");
            String response = sc.next();
            if (response.equalsIgnoreCase("yes")) {
                continueRide = false;
                System.out.println("You have exited the bus. Total distance traveled: " + totalDistance);
            }
        }

        sc.close();
    }
}