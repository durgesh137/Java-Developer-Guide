package streams.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringsUppercase {
    static void main(String[] args) {
        System.out.println("Transforming Strings to Uppercase using Stream...");
        List<String> languages = Arrays.asList("Java", "Golang", "Python", "JavaScript", "Php", "C#");
        System.out.println("Original languages: " + languages);

        List<String> uppercases = languages.stream()
                .filter(Objects::nonNull)// avoid NPE
                .filter(s -> !s.isBlank())// filtering empty and whitespace strings
                .map(String::toUpperCase) //transforming to uppercase now
                .toList();//returns unmodifiable list java 16+
        //for modifiable list, use Collectors.toList()
        System.out.println("Uppercases: " + uppercases);

        // getting string elements in form of single string in uppercase, like to execute in SQL
        //within IN clause or CSV file entries
        String result = languages.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isBlank())
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));

        System.out.println("Uppercases single String: " + result);
    }
}

/**
 * Key points-
 * 1. Here toList() method gives unmodifiable list
 * 2. Use Collectors.toList() to get modifiable list
 * 3. to get this result in form of single string separated by comma use Collectors.joining(",) within collect()
 */
