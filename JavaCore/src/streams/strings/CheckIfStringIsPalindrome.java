package streams.strings;

import java.util.stream.IntStream;

public class CheckIfStringIsPalindrome {
    static void main(String[] args) {
        System.out.println("Palindrome string using Stream api....");
        String word = "racecar";

        String cleanWord = word.toLowerCase();
        boolean result =
                IntStream.range(0, cleanWord.length()/2)
                        .allMatch(i -> cleanWord.charAt(i) == cleanWord.charAt(cleanWord.length()-i-1));
        System.out.println("Is "+word+" a palindrome string: "+result);

    }
}

/**
 * Key Points
 * 1. allMatch vs mapping: allMatch is a short-circuiting terminal operation.
 * - As soon as it finds one mismatch (e.g., in "racebar"), it stops processing and returns false. This prevents unnecessary execution delay.
 *
 * 2. Memory Overhead:
 * - Don't convert the string to ab array and then stream it, since this will create a duplicate copy of the data in memory.
 * - In a high-concurrency system, we use word.charAt(i) to access the existing internal buffer directly without extra allocations.
 *
 * 3. The "Short-Circuit" Benefit:
 * - UseIntStream.range only to iterate through half the string.
 * - For a string of 1 million characters, here we are making 500,000 comparisons, hence reducing the CPU cost.
 */