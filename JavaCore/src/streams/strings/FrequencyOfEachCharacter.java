package streams.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    static void main(String[] args) {
        String str = "abcdefgabcdefgh";
        Map<String, Long> charFrequencyMap = Arrays
                .stream(str.split("")) //converting array to stream
                .collect(
                        // here making each character a key, further increment each time same character
                        // is encountered
                        Collectors.groupingBy(c -> c, Collectors.counting())
                );
        System.out.println(charFrequencyMap);
    }
}
