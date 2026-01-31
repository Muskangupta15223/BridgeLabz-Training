package com.functionalinterface.backgroundjobexecution;

public class JobExecution {

    public static void main(String[] args) {
        // Background task
        Runnable job = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000); // simulate long task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background job finished");
        };

        Thread t = new Thread(job);
        t.start(); // async execution

        System.out.println("Main thread continues...");
    }
}
