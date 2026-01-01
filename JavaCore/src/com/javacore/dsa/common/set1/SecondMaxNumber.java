package com.javacore.dsa.common.set1;

import com.javacore.streams.common.helpers.CommonUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SecondMaxNumber {
    static void main(String[] args) {
        System.out.println("Second Max Number using Stream");
        List<Integer> numbers = CommonUtils.getUnmodifiableDuplicates();
        //[100, 200, 100, 200, 700, 6, 700, 8, -900]
        System.out.println("Original: " + numbers);

        // below logic finds second highest element but does not take into account duplicates
        numbers.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .skip(1)
                .findFirst()
                //prints 700, it should be 200
                .ifPresentOrElse(n-> System.out.println("Second Max Number: "+n),
                        () -> System.out.println("Second Max Number is empty")
                );

        //Optimized handling duplicates as in approach 2
        System.out.println("\nApproach II handling duplicates as well while finding second max number...");
        System.out.println("Original List data: "+numbers);
        numbers.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .distinct()
                .skip(1)
                .findFirst()
                .ifPresentOrElse(n-> System.out.println("Approach II Second Max Number: "+n),
                        () -> System.out.println("Approach II Second Max Number is empty"));
    }
}

/**
 * Key Points-
 * 1. If use case is to provide unique results, prefer filter unique records prior to sorting
 * - sorted().distinct() - NOT RECOMMENDED
 * - distinct().sorted() - RECOMMENDED
 * 2. Since sorting sample size will get reduced by finding unique elements, which will make it much faster
 * - Think about sorting 1 million then finding distinct records.
 * - While first finding unique records, reduce 1million size by 20% then sorting, it will become much faster
 * 3. Always handle null pointers with filter
 * 4. distinct() is a stateful intermediate operation that maintains an internal HashSet.
 * - For massive datasets, this is still better than sorting a huge list.
 */