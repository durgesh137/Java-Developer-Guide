package com.javacore.streams.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class longestString {
    static void main(String[] args) {
        System.out.println("Finding longest String in List using Stream...");
        List<String> words = Arrays.asList("samuel", "Tom", "Arthur", "Emanuel", "Shakespeare");
        String longestWord = words.stream()
                .filter(Objects::nonNull)
                .reduce("", (s1, s2) -> {
                    return s1.length() > s2.length() ? s1 : s2;
                });
        System.out.println(longestWord);
        // better version using max method
        Optional<String> longestWord2 = words.stream()
                .max(Comparator.comparing(String::length));
        System.out.println("Longest string: " + longestWord2.get() + " length: " + longestWord2.get().length());

        // using collect method
        Optional<String> maxString = words.stream()
                .collect(Collectors.maxBy(Comparator.comparing(String::length)));
        maxString.ifPresent(word -> System.out.println("Longest string: " + word + " length: " + word.length()));
    }
}
