package com.payexpress;

public class PayXpressApp {

    public static void main(String[] args) {

        Bill b1 = new ElectricityBill(1200, "20-Jan-2026");
        Bill b2 = new WaterBill(600, "18-Jan-2026");
        Bill b3 = new InternetBill(999, "15-Jan-2026");

        b1.sendRemainder();
        b2.sendRemainder();
        b3.sendRemainder();

        System.out.println();

        b1.pay();
        b2.pay();
        b3.pay();
    }
}