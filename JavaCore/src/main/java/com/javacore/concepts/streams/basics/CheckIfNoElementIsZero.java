package com.javacore.concepts.streams.basics;

import java.util.Arrays;
import java.util.List;

public class CheckIfNoElementIsZero {
    static void main(String[] args) {
        System.out.println("Check if nothing is zero using Stream");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("List : "+list);
        //noneMatch provides true if any element does not meet the predicate condition
        //similarly for empty list it also gives true
        //rest others it gives false
        boolean zeroThere = list.stream()
                .noneMatch(x -> x == 0);//it is short-circuit operation as well
        if(zeroThere){
            System.out.println("Zero is not present in list");
        }else{
            System.out.println("Zero is present in list");
        }
    }
}
