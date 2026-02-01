package com.functionalinterface.dataserialization;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainApp {

	public static void main(String args[]) throws FileNotFoundException, IOException {
		
		  Employee emp = new Employee("Muskan", 101, 50000);
	        BackupProcessor.backup(emp); 

	        TempSession session = new TempSession("TEMP123");
	        BackupProcessor.backup(session);
	    }	
}
