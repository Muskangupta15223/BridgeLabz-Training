package com.collection.junit;

import org.junit.jupiter.api.*;

public class DatabaseConnectionTest {
	
	DatabaseConnection db;
	
	@BeforeEach
	void setup() {
		db = new DatabaseConnection();
		db.connect();
	}
	
	@AfterEach
	void teardown() {
		db.disconnect();
	}
	
	@Test
	void ConnectionEstablishedTest() {
		Assertions.assertTrue(db.isConnected(), "Database should be connected after setup.");
	}
	
	@Test
	void ConnectionIsCLosedTest() {
		  db.disconnect();
	        Assertions.assertFalse(db.isConnected(),
	                "Database should be disconnected");
	}
}
