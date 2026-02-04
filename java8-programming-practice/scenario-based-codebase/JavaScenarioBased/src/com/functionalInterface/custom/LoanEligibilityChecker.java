package com.functionalInterface.custom;

@FunctionalInterface
public interface LoanEligibilityChecker {
    boolean isEligible(double income, int creditScore);
}
