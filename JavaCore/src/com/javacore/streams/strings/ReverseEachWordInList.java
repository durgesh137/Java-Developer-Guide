package com.javacore.streams.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//"Reverse each word" means the sequence of words stays the same,
// but the internal characters of every string are flipped
public class ReverseEachWordInList {
    static void main(String[] args) {
        System.out.println("Reverse Each Word In List using Stream...");
        List<String> words = Arrays.asList("samuel", "Tom", "Arthur", "Emanuel", "Shakespeare");
        System.out.println("Original List: " + words);
        List<String> reversedWords = words.stream()
                .filter(Objects::nonNull)
                .filter(word -> !word.isEmpty())
                .map(i -> new StringBuffer(i).reverse().toString())
                .toList();
        System.out.println("Reversed Words in list: "+reversedWords);
    }
}

/**
 * Key Points
 * 1. StringBuilder Efficiency: StringBuilder.reverse() is a highly optimized,
 * in-place character array manipulation.
 * - industry standard for reversing strings in Java because String itself is immutable
 */