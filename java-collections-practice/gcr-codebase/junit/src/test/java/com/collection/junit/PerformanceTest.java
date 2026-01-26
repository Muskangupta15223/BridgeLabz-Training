package com.collection.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PerformanceTest {

	Performance p = new Performance();
	@Test
	@Timeout(2)
	// The test will fail if longRunningTask() takes more than 2 seconds
	void longRunningTaskTest() throws InterruptedException {
		String result = p.longRunningTask();
		Assertions.assertEquals("Task Completed successfully", result);
	}
	
}
