package com.javacore.concepts.streams.basics;

import java.util.Arrays;
import java.util.List;

public class FilterStrings {
    static void main(String[] args) {
        List<String> names = Arrays.asList("Aaron", "David", "Craig", "Akon", "Tim");
        List<String> namesWithA = names.stream()
                .filter(word -> word.charAt(0) == 'A')
                .toList();
        System.out.println("Names starting with 'A': "+namesWithA);

        List<String> namesWithLengthOfFour = names.stream()
                .filter(word -> word.length() > 4)
                .toList();
        System.out.println("Names having length > 4: "+namesWithLengthOfFour);
    }
}
