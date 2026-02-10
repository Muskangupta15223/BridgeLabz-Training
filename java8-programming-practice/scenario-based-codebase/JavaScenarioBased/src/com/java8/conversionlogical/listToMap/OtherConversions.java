package com.java8.conversionlogical.listToMap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OtherConversions {
	public static void main(String[] args) {

		List<String> words = Arrays.asList("java", "spring", "boot", "java");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3);

		Map<String, Integer> sampleMap = new HashMap<>();
		sampleMap.put("A", 10);
		sampleMap.put("B", 20);
		sampleMap.put("C", 15);

		System.out.println("\n1. Stream → List\n");
		System.out.println(words.stream().toList());
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n2. Stream → Set\n");
		System.out.println(words.stream().collect(Collectors.toSet()));
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n3. Stream → Map\n");
		System.out.println(words.stream().collect(Collectors.toMap(Function.identity(), String::length, (a, b) -> a)));
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n4. Optional → List\n");
		Optional<String> opt = Optional.of("java");
		System.out.println(opt.stream().collect(Collectors.toList()));
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n5. List → Comma String\n");
		System.out.println(String.join(",", words));
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n6. List → JSON-like String\n");
		System.out.println(words.stream().map(w -> "\"" + w + "\"").collect(Collectors.joining(",", "[", "]")));
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n7. Map → Comma String\n");
		System.out.println(sampleMap.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue())
				.collect(Collectors.joining(",")));
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n8. List → Grouped Map\n");
		System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n9. Grouped Map → List\n");
		words.stream().collect(Collectors.groupingBy(String::length)).values().stream().flatMap(List::stream)
				.forEach(System.out::println);
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("\n10. Partitioned Map → Two Lists\n");
		Map<Boolean, List<Integer>> part = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

		System.out.println("Even: " + part.get(true));
		System.out.println("Odd: " + part.get(false));
		System.out.println(
				"________________________________________________________________________________________________");
	}
}
