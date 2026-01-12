package com.CallCenter;

public class Customer {
    String id;
    String name;
    boolean isVIP;
    long callTime;

    Customer(String id, String name, boolean isVIP) {
        this.id = id;
        this.name = name;
        this.isVIP = isVIP;
        this.callTime = System.currentTimeMillis();
    }
}
