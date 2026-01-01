package com.javacore.streams.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortListStringBasedOnLength {
    static void main(String[] args) {
        System.out.println("Sort strings by length using Stream API...");
        List<String> words = Arrays.asList("samuel", "Tom", "Arthur", "Emanuel", "Shakespeare");
        System.out.println("Original List: " + words);

        List<String> wordsByLength = words.stream()
                .filter(Objects::nonNull)
                .filter(word -> !word.isEmpty())
                .sorted(Comparator.comparing(String::length).reversed())
                .toList();
        System.out.println("Sorted List: " + wordsByLength);


        //Sorting list by word length, further in case length is same sorting them in alphabetical order
        List<String> wordsSorted = words.stream()
                .filter(Objects::nonNull)
                .filter(word -> !word.isEmpty())
                .sorted(Comparator.comparing(String::length).reversed()
                        .thenComparing(Comparator.naturalOrder()))
                .toList();
        System.out.println("Sorted List(Approach 2): " + wordsSorted);
    }
}

/**
 * Key Points-
 * 1. Stability:
 * - Java’s Stream.sorted() uses a stable sort (TimSort).
 * - If two words have the same length (e.g., "Samuel" and "Arthur" both have 6 letters),
 * their relative order from the original list is preserved.
 *
 * 2. Performance Trap:
 * - Sorting is a stateful intermediate operation.
 * - Unlike filter, the stream cannot process elements one by one;
 * - it must buffer the entire list into memory before it can sort.
 * - On a massive dataset, this can cause a significant delay or an OutOfMemoryError.
 *
 * 3. Approach 2:
 * - It handles the scenario when lengths are same even then strings are sorted based on alphabetical order
 */