package streams.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SumSquareOfOdds {
    static void main(String[] args) {
        System.out.println("Finding Sum of square of all odd numbers using Stream api...");
        List<Integer> list = Arrays.asList(null,1, 2, 3, 4, 5, 6);

        // for high performance, skipping boxing/unboxing and using primitive directly
        int oddsSquareSum = list.stream()
                .filter(Objects::nonNull) //filtering nulls
                .filter(x ->  x % 2 != 0) //allow only odds
                .mapToInt(x -> x * x)
                .sum();
        System.out.println("Result: " + oddsSquareSum);

        //more readable and maintainable
        Integer result = list.stream()
                .filter(Objects::nonNull)
                .filter(x -> x % 2 != 0)
                .map(x -> x * x)
                .reduce(0, Integer::sum);
        System.out.println("Approach II odds square sum: "+result);

        // Practitioner Approach: Single Filter to reduce pipeline overhead
        // We use short-circuiting logic (&&) to ensure % 2 only runs if x is non-null
        int result2 = list.stream()
                .filter(x -> x != null && x % 2 != 0)
                .mapToInt(x -> x * x)
                .sum();
        System.out.println("Approach III odds square sum: "+result2);
    }
}

/**
 * Key Points-
 * 1. Pipeline Overhead: Every time you add a .filter(),
 * - Java creates a new instance of an internal class (like StatelessOp). For small lists, this is negligible.
 * - For a stream processing millions of Kafka events, these extra object allocations add up and
 * put unnecessary pressure on the Garbage Collector.
 *
 * 2. Short-Circuiting Safety: In a single filter, the && operator is critical.
 * - Because it short-circuits, if x is null, the second part (x % 2 != 0) never executes.
 * - This is what prevents the NullPointerException during unboxing.
 *
 * 3. Readability vs. Performance Trade-off:
 * - Subsequent Filters: More "Declarative."
 * - It follows the "One Responsibility" rule where each filter does one thing. Better for maintenance.
 *
 * 4. Single Filter: More "Performant."
 * It reduces method stack depth and object overhead.
 *
 * 5. JIT Optimization: Modern JVMs (Java 17/21) are quite good at "Inlining" subsequent filters,
 * - but a System Owner doesn't rely on the compiler's "mercy"—we build the most efficient path ourselves.
 */