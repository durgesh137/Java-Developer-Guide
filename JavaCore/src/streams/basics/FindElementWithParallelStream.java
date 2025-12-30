package streams.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FindElementWithParallelStream {
    static void main(String[] args) {
        System.out.println("Find elements using parallel stream");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Original List : "+list);
        list.stream()
                .parallel()
                .filter(Objects::nonNull)
                .findAny()
                .ifPresentOrElse(
                        element -> System.out.println("Element found in list: "+element),
                        () -> System.out.println("No element found")
                );
    }
}

/**
 * Recommended Approaches-
 * 1. findAny() is faster than findFirst with parallel stream, since it does not need to maintain the pointer
 * to find the first element, which element findAny() it returns it
 * - further it is short-circuiting terminal operation
 * - Once any worker thread finds a value, it sends a cancellation signal to all other
 * threads to stop working. This is the "System Owner" way to save resources.
 *
 * 2. Parallel stream is good for larger datasets > 10,000 elements, for small data sets like size 9, it is
 * not recommended
 * - since the overhead of splitting and merging threads actually makes this slower than a sequential stream
 */
