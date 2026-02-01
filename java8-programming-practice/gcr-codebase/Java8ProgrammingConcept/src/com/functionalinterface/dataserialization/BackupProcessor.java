package com.functionalinterface.dataserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class BackupProcessor {
	  public static void backup(Object obj) {

	        if (!(obj instanceof BackupMarker)) {
	            throw new RuntimeException("Backup not allowed for this class");
	        }

	        try {
	            ObjectOutputStream oos =
	                    new ObjectOutputStream(new FileOutputStream("backup.ser"));

	            oos.writeObject(obj);
	            oos.close();

	            System.out.println("Backup completed successfully");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	  }     
}
