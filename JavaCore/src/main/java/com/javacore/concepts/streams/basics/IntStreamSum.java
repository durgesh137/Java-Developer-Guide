package com.javacore.concepts.streams.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class IntStreamSum {
    static void main(String[] args) {
        System.out.println("List to IntStream conversion further finding sum using Stream...");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Original list: " + list);
        // Practitioner Approach: Single-pass filter and primitive sum
        // 1. stream() - Starts the object stream
        // 2. filter() - Removes nulls to prevent NPE during unboxing
        // 3. mapToInt() - Converts Stream<Integer> to IntStream
        // 4. sum() - Terminal operation optimized for primitives
        int totalSum = list.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Total Sum (Primitive): " + totalSum);

        // To explicitly get the IntStream object for further use:
        IntStream primitiveStream = list.stream()
                .filter(Objects::nonNull)
                .mapToInt(i -> i); // Auto-unboxing works here too
        System.out.println("Total Sum (Stream): " + primitiveStream.sum());
    }
}
