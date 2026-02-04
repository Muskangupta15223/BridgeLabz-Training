package com.functionalInterface.runnable;

public class BackgroundTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Background task is running");
    }
}
