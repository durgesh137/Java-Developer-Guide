package com.javacore.streams.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ExtractUniqueElementsFromList {
    static void main(String[] args) {
        System.out.println("Extract unique elements from list using Streams");
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5, null,1);
        System.out.println("Original list: " + list);

        List<Integer> uniqueOnes = list.stream()
                .filter(Objects::nonNull)
                .distinct()
                .toList();
        System.out.println("Unique elements in list: " + uniqueOnes);

    }
}

/**
 * Key Points-
 * 1. Stateful Operation Cost: distinct() is a stateful intermediate operation.
 * - Unlike filter, it must maintain an internal HashSet to remember every element it has seen.
 * - In a Parallel Stream, this requires heavy synchronization to maintain consistency across threads,
 * which will delay execution significantly for large datasets.
 *
 * 2. The Null Trap: As demonstrated, distinct() sees null as just another unique value.
 * - In a Banking application, having a null in a list of IDs can break subsequent API calls or database inserts.
 * -Always approve a filter(Objects::nonNull) step before distinct().
 *
 * 3. Memory Pressure: Since distinct() stores unique elements in memory,
 * - hence using distinct on 50 million records streams can lead to an OutOfMemoryError (OOM).
 * - Prefer performing DISTINCT or GROUP BY at the Database level whenever possible to save JVM heap space.
 *
 * 4. Order Preservation:
 * - If source is List, distinct() preserves the "encounter order" (the first occurrence of each duplicate is kept).
 * - If source is Set, the order is not guaranteed.
 *
 * 5.Common Use-case of distinct():  find distinct objects based on a specific property
 * - like unique Employees by ID
 * - Here distinct() won't work directly because it uses the whole object's equals().
 * - In that case, use custom predicate or Collectors.toMap with a merge function to pick the first occurrence.
 */