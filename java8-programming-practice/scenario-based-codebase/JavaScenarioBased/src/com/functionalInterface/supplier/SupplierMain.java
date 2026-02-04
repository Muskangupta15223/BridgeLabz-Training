package com.functionalInterface.supplier;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {

        // 1. Generate OTP
        Supplier<String> otpSupplier = () -> {
            int otp = (int) (Math.random() * 900000) + 100000;
            return String.valueOf(otp);
        };

        System.out.println("Generated OTP: " + otpSupplier.get());

        // 2. Generate random student ID
        Supplier<Student> studentIdSupplier =
                () -> new Student("STU-" + UUID.randomUUID().toString().substring(0, 6).toUpperCase());

        Student student = studentIdSupplier.get();
        System.out.println("Generated Student ID: " + student.getStudentId());

        // 3. Provide current date and time
        Supplier<LocalDateTime> dateTimeSupplier =
                LocalDateTime::now;

        System.out.println("Current Date and Time: " + dateTimeSupplier.get());

        // 4. Provide default welcome message
        Supplier<String> welcomeMessageSupplier =
                () -> "Welcome to the application. Have a great day.";

        System.out.println("Welcome Message: " + welcomeMessageSupplier.get());

        // 5. Generate random discount coupon
        Supplier<Coupon> couponSupplier =
                () -> new Coupon("DISC-" + UUID.randomUUID().toString().substring(0, 5).toUpperCase());

        Coupon coupon = couponSupplier.get();
        System.out.println("Generated Discount Coupon: " + coupon.getCouponCode());
    }
}

