package com.javacore.streams.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLongestString {
    static void main(String[] args) {
        System.out.println("Finding second longest string using Stream...");
        List<String> words = Arrays.asList("samuel", "Tom", "Arthur", "Emanuel", "Shakespeare");
        System.out.println("Original List: " + words);

        words.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .ifPresent(x-> System.out.println("Second Longest String: " + x));

        //for third largest one, two strings are having same length
        // to find third unique length string by ignoring the duplicates, try solving that
    }
}
