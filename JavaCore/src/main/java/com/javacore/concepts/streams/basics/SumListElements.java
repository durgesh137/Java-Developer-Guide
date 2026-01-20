package com.javacore.concepts.streams.basics;

import java.util.Arrays;
import java.util.List;

public class SumListElements {
    public static void main(String[] args) {
        System.out.println("List operations with stream");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Method 1: Using sum() method
        int sum1 = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum using sum() method: " + sum1);

        // Method 2: Using reduce() with method reference
        int sum2 = numbers.stream()
                . reduce(0, Integer::sum);

        System.out.println("Sum using reduce() with Integer::sum: " + sum2);

        // Method 3: Using reduce() with lambda expression
        int sum3 = numbers. stream()
                .reduce(0, (a, b) -> a + b);

        System.out. println("Sum using reduce() with lambda: " + sum3);

    }
}