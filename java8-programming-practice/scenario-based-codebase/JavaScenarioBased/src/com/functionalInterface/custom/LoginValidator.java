package com.functionalInterface.custom;

@FunctionalInterface
public interface LoginValidator {
    boolean validate(String username, String password);
}

