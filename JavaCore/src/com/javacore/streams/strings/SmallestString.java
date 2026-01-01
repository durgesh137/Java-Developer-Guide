package com.javacore.streams.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestString {
    static void main(String[] args) {
        System.out.println("Smallest String in List using Stream...");
        List<String> words = Arrays.asList("samuel", "Tom", "Arthur", "Emanuel", "Shakespeare");

        words.stream()
                .min(Comparator.comparing(String::length))
                .ifPresentOrElse(
                        word -> System.out.println("Smallest String: " + word + " length: " + word.length()),
                        ()->{
                            System.out.println("List is empty");
                        });

        words.stream()
                .collect(Collectors.minBy(Comparator.comparing(String::length)))
                .ifPresent(word -> System.out.println("Smallest String: " + word + " length: " + word.length()));
    }
}
