package streams.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class ReverseEachWordPreservingCaseOfOriginalFirstLetter {
    static void main(String[] args) {
        List<String> words = Arrays.asList("samuel", "Tom", "Arthur", "Emanuel", "Shakespeare");
        System.out.println("Original List: " + words);

        List<String> result = words.stream()
                .filter(Objects::nonNull)
                .filter(word -> !word.isEmpty())
                .map(text -> {
                    String reverse = new StringBuilder(text).reverse().toString();//
                    String firstCharacter = reverse.substring(0, 1).toUpperCase(Locale.ROOT);
                    return firstCharacter + reverse.substring(1).toLowerCase(Locale.ROOT);
                })
                .toList();
        System.out.println("Reversed List: " + result);

        List<String> optimizedReverse = words.stream()
                .filter(Objects::nonNull)
                .filter(word -> !word.isEmpty())
                .map(word -> {
                    //Garbage Collector recommended approach to prevent number of objects
                    StringBuilder sb = new StringBuilder(word);
                    sb.reverse();
                    for (int i = 0; i < sb.length(); i++) {
                        if (i == 0) {
                            sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                        } else {
                            sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
                        }
                    }
                    return sb.toString();
                })
                .toList();
        System.out.println("Reversed List: " + optimizedReverse);
    }
}

/**
 * Key Points-
 * 1. Approach 1 involves creating two string objects at-least for one word to return reversed one.
 * - if million of words are there, we need to the same then at-least 2million objects will be there
 *
 * 2. Approach 2 is Garbage collector favoured
 * - here whole transformation on the word is done using StringBuilder only
 * - at last for each word, required String equivalent is returned, preventing amount of load on the GC
 */