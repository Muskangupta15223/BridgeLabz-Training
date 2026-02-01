package com.functionalinterface.passwordvalidator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public interface SecurityUtils {

    // Static method inside interface
    static boolean isStrongPassword(String password) {

        Predicate<String> minLength =
                pwd -> pwd.length() >= 8;

        Predicate<String> hasUpperCase =
                pwd -> pwd.chars().anyMatch(Character::isUpperCase);

        Predicate<String> hasLowerCase =
                pwd -> pwd.chars().anyMatch(Character::isLowerCase);

        Predicate<String> hasDigit =
                pwd -> pwd.chars().anyMatch(Character::isDigit);

        Predicate<String> hasSpecialChar =
                pwd -> pwd.chars().anyMatch(ch -> !Character.isLetterOrDigit(ch));

        // Combine all rules
        List<Predicate<String>> rules = Arrays.asList(
                minLength,
                hasUpperCase,
                hasLowerCase,
                hasDigit,
                hasSpecialChar
        );

        return rules.stream()
                    .allMatch(rule -> rule.test(password));
    }
}
