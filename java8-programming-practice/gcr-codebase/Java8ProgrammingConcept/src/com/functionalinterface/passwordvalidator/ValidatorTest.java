package com.functionalinterface.passwordvalidator;

public class ValidatorTest {

	public static void main(String[] args) {

        String password1 = "Abc@1234";
        String password2 = "abc123";

        System.out.println(password1 + " → "
                + SecurityUtils.isStrongPassword(password1));

        System.out.println(password2 + " → "
                + SecurityUtils.isStrongPassword(password2));
    }
}
