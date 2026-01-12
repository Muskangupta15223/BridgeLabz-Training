package com.ambulanceroute;

public class HospitalUnit {
    String name;
    boolean available;
    HospitalUnit next;

    HospitalUnit(String name, boolean available) {
        this.name = name;
        this.available = available;
    }
}
