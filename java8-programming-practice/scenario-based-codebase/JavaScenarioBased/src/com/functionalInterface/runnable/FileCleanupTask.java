package com.functionalInterface.runnable;

public class FileCleanupTask implements Runnable {

    @Override
    public void run() {
        System.out.println("File cleanup task executed");
    }
}
