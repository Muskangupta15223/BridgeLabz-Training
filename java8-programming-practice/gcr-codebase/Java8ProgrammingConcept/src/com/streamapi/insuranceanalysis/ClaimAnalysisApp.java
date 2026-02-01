package com.streamapi.insuranceanalysis;
import java.util.*;
import java.util.stream.Collectors;

public class ClaimAnalysisApp {

    public static void main(String[] args) {

        List<Insurance> claims = Arrays.asList(
                new Insurance("Health", 50000),
                new Insurance("Health", 70000),
                new Insurance("Vehicle", 30000),
                new Insurance("Vehicle", 45000),
                new Insurance("Life", 100000),
                new Insurance("Life", 120000)
        );

        // groupingBy + averagingDouble
        Map<String, Double> averageClaimByType =
                claims.stream()
                        .collect(Collectors.groupingBy(
                                Insurance::getClaimType,
                                Collectors.averagingDouble(Insurance::getClaimAmount)
                        ));

        // Print result
        averageClaimByType.forEach(
                (type, avg) -> System.out.println(type + " → Average Claim: " + avg)
        );
    }
}

