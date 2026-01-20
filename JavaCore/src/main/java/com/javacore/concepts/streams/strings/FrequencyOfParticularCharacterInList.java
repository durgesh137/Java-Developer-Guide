package com.javacore.concepts.streams.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FrequencyOfParticularCharacterInList {
    static void main(String[] args) {
        System.out.println("Frequency of particular character in list using Stream...");
        List<String> words = Arrays.asList("samuel", "Tom", "Arthur", "Emanuel", "Shakespeare");
        String targetChar = "a";

        long characterCount = words.stream()
                .flatMap(ch -> Arrays.stream(ch.split("")))
                .filter(c -> c.equalsIgnoreCase(targetChar))
                .count();
        System.out.println("Total occurrences: "+characterCount);

        //optimized approach to avoid creating extra objects within memory/heap
        long optimizedCount = words.stream()
                .filter(Objects::nonNull)
                .flatMapToInt(String::chars) // Primitive stream of char codes
                .filter(c -> c == targetChar.charAt(0) || c == Character.toUpperCase(targetChar.charAt(0)))
                .count();

        System.out.println("Total occurrence (optimized): " + optimizedCount);

    }
}

/**
 * Key Points-
 * 1. flatMap Internal Mechanics: flatMap is used to "flatten" a stream of streams.
 * Here, it takes each word, turns it into a Stream<String> of its characters,
 * and then merges all those into one big single stream of characters.
 *
 * 2. Memory Pressure: word.split("") creates a new array for every single string in your list.
 * - For 1 million strings, this creates 1 million extra arrays on the heap.
 * - Using String::chars (as shown in Approach 2) is the "System Owner" way to
 * avoid this delay and keep the Garbage Collector quiet.
 */