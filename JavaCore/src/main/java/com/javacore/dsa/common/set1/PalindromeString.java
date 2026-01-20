package com.javacore.dsa.common.set1;

import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Palindrome String-
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * - PASSED ALL TEST CASES on LEETCODE- https://leetcode.com/problems/valid-palindrome/description/?envType=problem-list-v2&envId=string
 * - only all methods are made static to avoid creating objects specifically
 */
public class PalindromeString {
    static void main(String[] args) {
        System.out.println("Checking Palindrome String");
        checkPalindrome("racecar");
        checkPalindrome("race a car");
    }

    private static void checkPalindrome(String s) {
        System.out.println("\nInput string: "+s);
        boolean result = isPalindrome(s);
        if(result){
            System.out.println(s+" is a palindrome.");
        }else{
            System.out.println(s+" is not a palindrome.");
        }

    }

    private static boolean isPalindrome(String s) {
        //data cleaning part
        if(Objects.isNull(s)){
            return false;
        }
        s = s.trim().toLowerCase();
        //getting only alphanumerics
        String alphaNumeric = s.chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(Character::toString)
                .collect(Collectors.joining());

        //compare original and reverse now
        String reversed = reverseString(alphaNumeric);
//        System.out.println("Strings "+alphaNumeric+" palindrome string: "+reversed);
        return reversed.equals(alphaNumeric);
    }

    private static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        return sb.reverse().toString();
    }
}

/**
 * Key Points-
 * 1. Character.isLetterOrDigit(char) - only allow a-z, A-Z, and 0-9
 * 2. "12321" is also palindrome, remember
 * 3. Always normalize casing at the initial stage, like "Madam" and "madam" are same.
 * 4. Empty string is a palindrome in most languages, count as palindrome only
 */