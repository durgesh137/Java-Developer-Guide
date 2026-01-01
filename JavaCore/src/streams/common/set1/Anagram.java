package streams.common.set1;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Anagram-
 * It is a word or phrase formed by rearranging the letters of another, using all original letters exactly once.
 * - Two strings are anagrams if they have the identical character counts for every character.
 * - ignore white spaces, punctuation, and numbers.
 * - PASSED ALL TEST CASES on LEETCODE- https://leetcode.com/problems/valid-anagram/description/?envType=problem-list-v2&envId=string
 * Example-
 * | Word 1          | Word 2          | Result | Category | Reason/Analysis                                      |
 * |-----------------|-----------------|--------|----------|------------------------------------------------------|
 * | "listen"        | "silent"        | TRUE   | Good     | Perfect match of all characters.                     |
 * | "race"          | "care"          | TRUE   | Good     | Standard 4-letter anagram.                           |
 * | "heart"         | "earth"         | TRUE   | Good     | Common English anagram.                              |
 * | "debit card"    | "bad credit"    | TRUE   | Good     | Loose anagram: valid if spaces are ignored.          |
 * | "astronomer"    | "moon starer"   | TRUE   | Good     | Complex multi-word anagram.                          |
 * | "apple"         | "pale"          | FALSE  | Bad      | Length mismatch; extra 'p' in apple.                 |
 * | "hello"         | "olelh"         | TRUE   | Good     | Jumbled but identical counts.                        |
 * | "test"          | "tset"          | TRUE   | Good     | Simple reversal is always an anagram.                |
 * | "java"          | "javaa"         | FALSE  | Bad      | Character count mismatch (extra 'a').                |
 * | "anagram"       | "nagaram"       | TRUE   | Good     | Identical counts across 7 chars.                     |
 * | "power"         | "tower"         | FALSE  | Bad      | 'p' vs 't' mismatch; characters differ.              |
 */
public class Anagram {
    static void main(String[] args) {
        System.out.println("Checking if two Strings are anagram or not using Stream...");
        checkAnagrams("listen", "si lent");
        checkAnagrams("heart", "earth ");
        checkAnagrams("debit card ", "bad credit");
        checkAnagrams("hello", "olelh");
        checkAnagrams("power", "tower");
        checkAnagrams("anagram", "nagaram");

    }

    private static void checkAnagrams(String s1, String s2) {
        System.out.println("\nInputs: "+s1+" "+s2);
        boolean result = isAnagram(s1, s2);
        if(result){
            System.out.println("Anagram found ie. "+s1+" "+s2);
        }else {
            System.out.println("Anagram not found ie. "+s1+" "+s2);
        }
    }

    private static boolean isAnagram(String s1, String s2) {
        if(Objects.isNull(s1) || Objects.isNull(s2)){
            return false;
        }
        String lowerCase1 = s1.trim().toLowerCase();
        String lowerCase2 = s2.trim().toLowerCase();
        //in case internal spacing is there between characters of string, direct length comparison will ignore valid anagrams
        //example- "listen", "si lent"
        lowerCase1 = Arrays.stream(lowerCase1.split(""))
                .filter(word-> !word.isBlank())
                .sorted()
                .collect(Collectors.joining(""));
        lowerCase2 = Arrays.stream(lowerCase2.split(""))
                .filter(word-> !word.isBlank())
                .sorted()
                .collect(Collectors.joining(""));
        System.out.println("lowerCase1 :"+lowerCase1+ " lowerCase2:"+lowerCase2);
        return lowerCase1.equals(lowerCase2);
    }
}

/**
 * Key Points
 * 1. Always all characters, spaces can be filtered
 * - for filtering spaces use isBlank() method rather than isEmpty()
 * 2. It is taking more memory, that is something we need to work on going forward, since many objects are created with split approach
 * - depending on input string size
 */