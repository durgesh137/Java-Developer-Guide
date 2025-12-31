package streams.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterStringContainingDigitsOnly {
    static void main(String[] args) {
        System.out.println("Filter strings containing digits only with Stream...");
        List<String> list = Arrays.asList("1", "2", "3", "40001", "05", "651", "Sam", "8Qwerty", "9999");
        System.out.println("Original list: " + list);

        // using Character class and all match
        List<String> list1 = list.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isBlank())
                .filter(s -> s.chars().allMatch(Character::isDigit))
                .toList();
        System.out.println("Result I: "+list1);

        //using regex
        List<String> digits = list.stream()
                .filter(x -> x.matches("[0-9]+"))
                .toList();
        System.out.println("Result II: " + digits);
    }
}

/**
 * Key Points-
 * 1. Most efficient approach to solve is using traditional for loop concept
 * - since for massive dataset, approach 1, s.chars().allMatch() creates a stream object for every word.
 *
 * 2. Regex is not recommended
 * - since it is less readable and maintainable
 * - Further Regex involves a state machine. For a list of 1 million strings, matches() will trigger significant CPU cycles.
 * - Character.isDigit is a simple bitwise or range check on the character code, making it significantly faster.
 */