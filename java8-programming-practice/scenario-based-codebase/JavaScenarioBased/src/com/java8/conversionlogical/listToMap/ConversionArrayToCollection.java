package com.java8.conversionlogical.listToMap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class ConversionArrayToCollection {

	public static void main(String[] args) {
	
		List<String> words = Arrays.asList("java", "spring", "boot", "java");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3);
		Set<Integer> set1 = new HashSet<>(numbers);	  
		System.out.println("\n*** ARRAY ↔ COLLECTION CONVERSIONS ***");

        String[] arr = {"java", "spring", "boot"};

        System.out.println("\n1. Array → List\n");
        System.out.println(Arrays.stream(arr).collect(Collectors.toList()));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n2. Array → Set\n");
        System.out.println(Arrays.stream(arr).collect(Collectors.toSet()));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n3. List → Array\n");
        System.out.println(Arrays.toString(words.toArray()));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n4. Set → Array\n");
		System.out.println(Arrays.toString(set1.toArray()));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n5. int[] → List<Integer>\n");
        int[] intArr = {1, 2, 3, 4};
        System.out.println(Arrays.stream(intArr).boxed().collect(Collectors.toList()));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n6. String[] → List<String>\n");
        System.out.println(Arrays.asList(arr));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n7. Array → Index Map\n");
        System.out.println(IntStream.range(0, arr.length)
                .boxed()
                .collect(Collectors.toMap(i -> i, i -> arr[i])));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n8. 2D Array → Flat List\n");
        Integer[][] matrix = {{1, 2}, {3, 4}, {5}};
        System.out.println(Arrays.stream(matrix)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList()));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n9. Array → Value Map\n");
        System.out.println(Arrays.stream(arr)
                .collect(Collectors.toMap(
                        Function.identity(),
                        String::length
                )));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n10. Array → Distinct List\n");
        String[] arr2 = {"java", "spring", "java"};
        System.out.println(Arrays.stream(arr2)
                .distinct()
                .collect(Collectors.toList()));
        System.out.println("________________________________________________________________________________________________");

	}
}
