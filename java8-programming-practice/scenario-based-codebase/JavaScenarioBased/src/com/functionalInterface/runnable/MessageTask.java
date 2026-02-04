package com.functionalInterface.runnable;

public class MessageTask implements Runnable {

    private String message;

    public MessageTask(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Message from separate thread: " + message);
    }
}
