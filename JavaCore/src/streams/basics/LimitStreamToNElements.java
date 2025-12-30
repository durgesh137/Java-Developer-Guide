package streams.basics;

import java.util.Arrays;
import java.util.List;

public class LimitStreamToNElements {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1,-2, -3, 1, 2, 3, 4, 5, 6, 7);
        System.out.println("Original list: " + list);
        System.out.println("Limiting stream... to n elements");
        int n = 5;
        List<Integer> firstNElements = list.stream()
                .limit(n)
                .toList();
        System.out.println("First n elements: " + firstNElements);
    }
}

/**
 * Recommendations-
 * 1. limit(n) fixes the memory issues, since once it processes n elements,
 * - it stops requesting data from source
 *
 * 2. It respects the encounter order, skip(5)
 * - for lists,it will always pick first 5 elements
 * - for unordered stream, it will provide any 5 random elements
 *
 * 3. Always approve a .sorted() call
 * before a limit() if the business logic requires the "highest" or "newest" records
 *
 * 4. When building for any enterprise platform, never call limit() in Java if
 * you can do it in the SQL query (e.g., LIMIT 5 or SELECT TOP 5).
 * - Moving the limit to the database level saves network bandwidth and memory,
 * - whereas doing it in the Stream API still requires the data to be fetched into the JVM's heap first.
 */