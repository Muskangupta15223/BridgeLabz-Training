package com.collections.medinventory;

import java.io.IOException;

public class MedInventoryMain {
	public static void main(String[] args) {
		MedInventoryManager manager = new MedInventoryManager();

		String csvFile = "D:\\BridgeLabz-Training\\java-collections-practice\\scenario-based\\JavaCollectionScenarioBased\\src\\com\\resources\\samplefiles\\inventory\\inventory.csv";

		try {
			manager.loadInventory(csvFile);
			manager.showExpiredItems();
			manager.showSummary();
			
		} catch (LowStockException e) {
			
			System.out.println("CRITICAL ALERT: " + e.getMessage());
		} catch (IOException e) {
			
			System.out.println("File error: " + e.getMessage());
		} catch (Exception e) {
			
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}
}
