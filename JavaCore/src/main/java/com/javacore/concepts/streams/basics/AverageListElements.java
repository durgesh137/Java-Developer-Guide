package com.javacore.concepts.streams.basics;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageListElements {
    public static void main(String[] args) {
        System.out.println("Average of elements present within List with Stream API");
        List<Double> prices = Arrays.asList(100d, 120d, 250.0, 30d);
        OptionalDouble average = prices.stream()
                .mapToDouble(Double::doubleValue)
                .average();
        if(average.isPresent()){
            System.out.println("Average value : "+average.getAsDouble());
        }

    }
}

/**
 * Things handled-
 * 1. By converting to a primitive stream early, we avoid the cost of repetitive boxing/unboxing
 * that would occur if you used a manual reduce operation.
 * 2. Here ArithmeticException due to dividing by zero is also handled
 *
 */