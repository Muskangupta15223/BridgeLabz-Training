package com.streamapi.filtermembership;
import java.time.LocalDate;
import java.util.*;

public class MembershipExpiryCheck {

    public static void main(String[] args) {

        List<GymMember> members = Arrays.asList(
                new GymMember("Amit", LocalDate.now().plusDays(10)),
                new GymMember("Neha", LocalDate.now().plusDays(40)),
                new GymMember("Rahul", LocalDate.now().plusDays(25)),
                new GymMember("Priya", LocalDate.now().minusDays(2))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        members.stream()
                .filter(member ->
                        !member.getExpiryDate().isBefore(today) &&
                         member.getExpiryDate().isBefore(next30Days)
)
                .forEach(System.out::println);
    }
}

