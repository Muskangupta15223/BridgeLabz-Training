package com.collection.junit;

public class Performance {

	public String longRunningTask() throws InterruptedException {
		Thread.sleep(3000);;
		return "Task Completed successfully";	
	}
}
