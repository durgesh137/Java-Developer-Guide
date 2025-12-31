package streams.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JoinListStringsWithPrefixAndSuffix {
    static void main(String[] args) {
        System.out.println("Join strings present within list with prefix and suffix using Stream...");
        List<String> words = Arrays.asList("samuel", "Tom", "Arthur", "Emanuel", "Shakespeare");

        String result = words.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.joining(",","[","]"));
        System.out.println(result);
    }
}

/**
 * Key Points-
 * 1. Internal Working:
 * - Collectors.joining uses a StringJoiner (or StringBuilder) internally.
 * - It appends the prefix once, iterates through the stream adding the delimiter between elements,
 * - and finally appends the suffix.
 *
 * 2. The "Joining" Contract:
 * - The joining collector is built to check hasNext().
 * - It only inserts the delimiter if there is another element coming.
 * - This is a built-in "System Owner" feature that prevents formatting bugs in production reports.
 *
 * 3. Performance:
 * - This is an $O(n)$ operation.
 * - Using the built-in collector is more memory-efficient than manual concatenation,
 *   since it avoids creating multiple temporary String objects on the heap.
 */