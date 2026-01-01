package com.javacore.streams.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfAllElementsPositiveInList {
    static void main(String[] args) {
        System.out.println("Checking if all elements positive in list Using Streams");
        List<Integer> list = Arrays.asList(1, 2, -3, 4, 5);
        boolean allPositives = list.stream()
                .allMatch(x -> x > 0);
        System.out.println("All positives: "+allPositives);

        //for below one we get true, even though any element is not there
        //hence first validate whether list contains elements or not
        list = new ArrayList<Integer>();
        boolean result = list.stream()
                .allMatch(x -> x > 0);
        System.out.println("All positives: "+result);


    }
}

