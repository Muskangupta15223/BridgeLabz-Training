package com.browserbuddy;

public class BrowserTab {

	 private Page current;

	 // Visit a new page
	 public void visit(String url) {
	     Page newPage = new Page(url);

	     if (current != null) {
	         current.next = newPage;
	         newPage.prev = current;
	     }
	     current = newPage;

	     System.out.println("Visited: " + url);
	 }

	 // Go back
	 public void back() {
	     if (current != null && current.prev != null) {
	         current = current.prev;
	         System.out.println("Back to: " + current.url);
	     } else {
	         System.out.println("No previous page");
	     }
	 }

	 // Go forward
	 public void forward() {
	     if (current != null && current.next != null) {
	         current = current.next;
	         System.out.println("Forward to: " + current.url);
	     } else {
	         System.out.println("No next page");
	     }
	 }

	 public String getCurrentPage() {
	     return current != null ? current.url : "No Page";
	 }
}

