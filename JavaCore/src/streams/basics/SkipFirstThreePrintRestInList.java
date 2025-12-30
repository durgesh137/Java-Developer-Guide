package streams.basics;

import java.util.Arrays;
import java.util.List;

public class SkipFirstThreePrintRestInList {
    static void main(String[] args) {
        System.out.println("Skip First three elements while print rest elements of list using Stream");
        List<Integer> list = Arrays.asList(-1,-2, -3, 1, 2, 3, 4, 5, 6, 7);
        System.out.println("Original list: " + list);
        System.out.println("Skipping First three elements from list...");
        //skip is intermediate operation
        list.stream()
                .skip(3)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}

/**
 * Recommendations-
 * 1. skip(n) only skips specified number of elements
 * - it has nothing to do with ordering
 * - if use-case is to have deterministic results, first sort the stream and use skip on top of it
 *
 * 2. Always prefer using skip at Database/Repository level as compared to using it at stream level since
 * -.skip(1_000_000) on a large stream -> the JVM still has to process and discard those million elements.
 * -It is not an $O(1)$ operation; it is $O(n)$.
 *
 * 3. skip() is stateful.
 * -It must keep track of how many elements have passed before it can start letting them through.
 * -In a Parallel Stream, this requires synchronization between threads, which can cause an execution delay.
 */
