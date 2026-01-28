package com.collections.dealtracker;

public class DealTrackerMain {
    public static void main(String[] args) {
        DealTracker<Deal> tracker = new DealTracker<>();

        String dealsFile = "D:\\BridgeLabz-Training\\java-collections-practice\\scenario-based\\JavaCollectionScenarioBased\\src\\com\\resources\\samplefiles\\deals\\deal1.txt";

        try {
            tracker.loadDeals(dealsFile);
            tracker.showActiveDeals();
            tracker.showDealCodes();

        } catch (InvalidDealException e) {
            System.out.println("Deal validation error: " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
