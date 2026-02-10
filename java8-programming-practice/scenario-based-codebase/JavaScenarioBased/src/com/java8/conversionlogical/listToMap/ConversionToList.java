package com.java8.conversionlogical.listToMap;

import java.util.*;
import java.util.function.Function;

public class ConversionToList {

	public static void main(String[] args) {

		Map<String, Integer> sampleMap = new HashMap<>();
		sampleMap.put("A", 10);
		sampleMap.put("B", 20);
		sampleMap.put("C", 15);

		System.out.println("\n1. Map Keys → List\n");
		System.out.println(new ArrayList<>(sampleMap.keySet()));
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n2. Map Values → List\n");
		System.out.println(new ArrayList<>(sampleMap.values()));
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n3. Map Entries → List\n");
		System.out.println(new ArrayList<>(sampleMap.entrySet()));
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n4. Key-Value String List\n");
		sampleMap.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue()).forEach(System.out::println);
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n5. Map → List of DTO\n");
		sampleMap.entrySet().stream().map(e -> new DTO(e.getKey(), e.getValue())).forEach(System.out::println);
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n6. Sorted by Key\n");
		sampleMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n7. Sorted by Value\n");
		sampleMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n8. Filter Value > 15\n");
		sampleMap.entrySet().stream().filter(e -> e.getValue() > 15).forEach(System.out::println);
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n9. Keys Where Value Even\n");
		sampleMap.entrySet().stream().filter(e -> e.getValue() % 2 == 0).map(Map.Entry::getKey)
				.forEach(System.out::println);
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n10. Entries → DTO List\n");
		sampleMap.entrySet().stream().map(e -> new DTO(e.getKey(), e.getValue())).forEach(System.out::println);
		System.out.println(
				"________________________________________________________________________________________________");

	}
}
