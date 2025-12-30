package streams.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharInString {
    static void main(String[] args) {
        System.out.println("First Non Repeating Char In String using Stream...");
        String word = "abcdabcdeabdcefabcde";

        String result = Arrays.stream(word.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(), //Key, the character
                        LinkedHashMap::new, //Supplier: to maintain insertion order
                        Collectors.counting()) //Downstream: frequency count
                )
                .entrySet().stream()//stream entries
                .filter(e -> e.getValue() == 1)//count must be 1
                .map(e -> e.getKey())//get the character key having count 1
                .findFirst()// Terminal: get firstMatch
                .orElse("None");
        System.out.println("First Non Repeating Char In String: " + result);
    }
}

/**
 * Key Points-
 * 1. The LinkedHashMap Requirement: A standard groupingBy uses a HashMap internally.
 * required to ensure the order of characters is not lost.
 *
 * 2. Performance Check: word.split("") creates an array of strings.
 * For a long string, this is a memory leak risk.
 * For high-performance systems  use word.chars().mapToObj(c -> (char)c) to avoid large array allocations.
 *
 * 3. Terminal Operations: This pipeline uses two streams. The first collect is an eager terminal operation.
 * The second stream() on the entrySet is required to process the map results.
 * This "Two-Phase" approach is the most readable way to ship this logic.
 *
 * 4. Optional Handling: findFirst() returns an Optional.
 * In production code, never call .get() directly. Always use .orElse() or .ifPresent()
 * to prevent unexpected crashes if every character in the string is a duplicate
 */