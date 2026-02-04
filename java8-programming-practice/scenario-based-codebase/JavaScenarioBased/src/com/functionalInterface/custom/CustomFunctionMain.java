package com.functionalInterface.custom;

public class CustomFunctionMain {

    public static void main(String[] args) {

        // 1. Calculate bonus
        Employee employee = new Employee("Muskan", 50000);

        BonusCalculator bonusCalculator =
                salary -> salary * 0.10;

        double bonus = bonusCalculator.calculate(employee.getSalary());

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Bonus: " + bonus);

        // 2. Check loan eligibility
        LoanEligibilityChecker loanChecker =
                (income, creditScore) -> income >= 30000 && creditScore >= 700;

        double income = 40000;
        int creditScore = 720;

        System.out.println("\nLoan Eligibility");
        System.out.println("Income: " + income);
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Eligible: " + loanChecker.isEligible(income, creditScore));

        // 3. Calculate tax
        TaxCalculator taxCalculator =
                inc -> inc * 0.15;

        double tax = taxCalculator.calculateTax(600000);

        System.out.println("\nTax Calculation");
        System.out.println("Annual Income: 600000");
        System.out.println("Tax Amount: " + tax);

        // 4. Validate user login
        User user = new User("admin", "admin123");

        LoginValidator loginValidator =
                (username, password) ->
                        username.equals("admin") && password.equals("admin123");

        boolean loginStatus =
                loginValidator.validate(user.getUsername(), user.getPassword());

        System.out.println("\nLogin Validation");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Login Successful: " + loginStatus);
    }
}
