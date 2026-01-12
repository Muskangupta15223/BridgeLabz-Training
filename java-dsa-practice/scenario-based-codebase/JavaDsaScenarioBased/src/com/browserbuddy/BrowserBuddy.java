package com.browserbuddy;

import java.util.Stack;

public class BrowserBuddy {

	 private Stack<BrowserTab> closedTabs = new Stack<>();
	 private BrowserTab activeTab = new BrowserTab();

	 // Open new tab
	 public void openTab() {
	     activeTab = new BrowserTab();
	     System.out.println("New tab opened");
	 }

	 // Close tab
	 public void closeTab() {
	     closedTabs.push(activeTab);
	     activeTab = new BrowserTab();
	     System.out.println(" Tab closed");
	 }

	 // Restore closed tab
	 public void restoreTab() {
	     if (!closedTabs.isEmpty()) {
	         activeTab = closedTabs.pop();
	         System.out.println(" Restored tab");
	     } else {
	         System.out.println("No tabs to restore");
	     }
	 }

	 public BrowserTab getActiveTab() {
	     return activeTab;
	 }
	 
}


