package com.javacore.concepts.streams.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TotalCharsInStrings {
    static void main(String[] args) {
        System.out.println("Counting total chars present in strings using Stream...");
        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f","aa", "bb", "cc", "dd", "ee", "ff");

        System.out.println("Original list: " + list);
        int allCharsSum = list.stream()
                .filter(Objects::nonNull)// avoiding Nulls
                .mapToInt(String::length)//convert to primitive intStream
                .sum();//aggregate
        System.out.println(allCharsSum);

    }
}
