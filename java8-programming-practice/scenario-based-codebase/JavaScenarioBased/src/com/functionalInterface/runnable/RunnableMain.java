package com.functionalInterface.runnable;

public class RunnableMain {

    public static void main(String[] args) {

        // 1. Run background task
        Thread backgroundThread = new Thread(new BackgroundTask());
        backgroundThread.start();

        // 2. Execute file cleanup task
        Thread cleanupThread = new Thread(new FileCleanupTask());
        cleanupThread.start();

        // 3. Print message in a separate thread
        Thread messageThread = new Thread(new MessageTask("Hello from Runnable"));
        messageThread.start();
    }
}

