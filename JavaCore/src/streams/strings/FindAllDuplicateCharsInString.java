package streams.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllDuplicateCharsInString {
    static void main(String[] args) {
        System.out.println("Find all duplicate chars in string using Stream...");
        String word = "abcdabcdeabdcefabcde";

        word =word.trim();
        List<Map.Entry<String, Long>> list = Arrays.stream(word.split(""))
                .filter(s -> !s.isBlank()) //filtering internal spaces
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .toList();
        System.out.println("Duplicate characters within String are : "+list);

    }
}

/**
 * Key Points
 * 1. The "Split" Loophole: Using word.split("") is memory-intensive.
 * - For every character in the string, a new String object is allocated on the heap.
 * - For a large payload in Onified.ai, this increases Garbage Collection pressure. Use word.chars() to work with primitives where possible.
 *
 * 2. Ordering:
 * - If ordering is maintained only using  groupingBy(Function.identity()), which uses a HashMap internally. The duplicates will appear in a "random" order.
 * - To find the duplicates in the order they first appeared, using LinkedHashMap::new as the map factory is recommended.
 *
 * 3. Whitespace Governance:
 * - Using trim() to remove spaces at end and start is safe approach.
 * - But trim() does not remove internal spaces between characters of string like "a b a ". Here The space in the middle will still be counted.
 * - to ensure spaces are ignored, using filter is recommended like,  add a .filter(c -> !c.isBlank()) before the grouping logic.
 */
