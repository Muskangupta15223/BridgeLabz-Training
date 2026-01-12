package com.browserbuddy;

public class BrowserApp {
	 public static void main(String[] args) {

	     BrowserBuddy browser = new BrowserBuddy();

	     browser.getActiveTab().visit("google.com");
	     browser.getActiveTab().visit("github.com");
	     browser.getActiveTab().visit("stackoverflow.com");

	     browser.getActiveTab().back();
	     browser.getActiveTab().back();
	     browser.getActiveTab().forward();

	     browser.closeTab();
	     browser.restoreTab();

	     System.out.println("Current Page: " + browser.getActiveTab().getCurrentPage());
	 }
}