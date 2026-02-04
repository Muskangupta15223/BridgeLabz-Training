package com.functionalInterface.consumer;

public class Employee {

    private String name;
    private String loginTime;

    public Employee(String name, String loginTime) {
        this.name = name;
        this.loginTime = loginTime;
    }

    public String getName() {
        return name;
    }

    public String getLoginTime() {
        return loginTime;
    }
}
