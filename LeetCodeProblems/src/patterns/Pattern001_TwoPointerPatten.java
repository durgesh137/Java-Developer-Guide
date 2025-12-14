package patterns;

import java.util.Arrays;

/**
 * Two Pointer Pattern
 *
 * Definition:
 * This pattern uses two pointers to traverse the data structure like Array or Linked List
 * from different ends or at different speeds (slow and fast or left and right pointers).
 *
 * Two Main Variations:
 * 1. Left-Right Pointer: Two pointers starting from opposite ends moving towards each other
 * 2. Slow-Fast Pointer: Two pointers starting from same end moving at different speeds
 *
 * Common Use Cases:
 * - Finding pairs in a sorted array that sum to a specific target
 * - Merging two sorted arrays
 * - Removing duplicates from a sorted array
 * - Partitioning an array based on a pivot value
 * - Palindrome checking
 * - Reversing arrays/strings
 *
 * Time Complexity: O(n) in most cases, where n is the number of elements
 * Space Complexity: O(1) for in-place algorithms, O(n) if additional data structures are used
 */
public class Pattern001_TwoPointerPatten {

    // ==================== APPROACH 1: LEFT-RIGHT POINTER ====================
    /**
     * Example Problem 1: Reverse Array In-Place - Left-Right Pointer
     * Reverse the elements of an array without using extra space.
     *
     * Approach: Swap elements from both ends moving towards center
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers
            left++;
            right--;
        }
    }

    /**
     * Example Problem 2: Check if String is Palindrome - Left-Right Pointer
     * Determine if a string reads the same forward and backward.
     *
     * Approach: Compare characters from both ends moving towards center
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    // ==================== APPROACH 2: SLOW-FAST POINTER ====================

    /**
     * Example Problem 3: Move Zeros to End - Slow-Fast Pointer
     * Move all zeros to the end while maintaining order of non-zero elements.
     *
     * Approach: Slow pointer for non-zero position, fast for scanning
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void moveZeros(int[] arr) {
        int slow = 0; // Position to place next non-zero element

        // Move all non-zero elements to front
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != 0) {
                arr[slow] = arr[fast];
                slow++;
            }
        }

        // Fill remaining positions with zeros
        while (slow < arr.length) {
            arr[slow] = 0;
            slow++;
        }
    }


    /**
     * Example Problem 4: Find Middle Element (Single Pass) - Slow-Fast Pointer
     * Find the middle element of array using slow-fast pointer.
     *
     * Approach: Fast moves 2 steps, slow moves 1 step
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int findMiddle(int[] arr) {
        if (arr.length == 0) return -1;

        int slow = 0;
        int fast = 0;

        while (fast < arr.length - 1 && fast + 1 < arr.length) {
            slow++;
            fast += 2;
        }

        return arr[slow];
    }

    // ==================== MAIN METHOD WITH EXAMPLES ====================

    public static void main(String[] args) {
        System.out.println("========== TWO POINTER PATTERN EXAMPLES ==========\n");

        // ===== LEFT-RIGHT POINTER EXAMPLES =====
        System.out.println("===== APPROACH 1: LEFT-RIGHT POINTER =====\n");

        // Example 1: Reverse Array
        System.out.println("Example 1: Reverse Array");
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Before: " + Arrays.toString(arr2));
        reverseArray(arr2);
        System.out.println("After:  " + Arrays.toString(arr2) + "\n");

        // Example 2: Palindrome Check
        System.out.println("Example 2: Check Palindrome");
        String str1 = "racecar";
        String str2 = "hello";
        System.out.println("\"" + str1 + "\" is palindrome: " + isPalindrome(str1));
        System.out.println("\"" + str2 + "\" is palindrome: " + isPalindrome(str2) + "\n");

        // ===== SLOW-FAST POINTER EXAMPLES =====
        System.out.println("===== APPROACH 2: SLOW-FAST POINTER =====\n");

        // Example 3: Move Zeros
        System.out.println("Example 6: Move Zeros to End");
        int[] arr6 = {0, 1, 0, 3, 12, 0, 5};
        System.out.println("Before: " + Arrays.toString(arr6));
        moveZeros(arr6);
        System.out.println("After:  " + Arrays.toString(arr6) + "\n");

        // Example 4: Find Middle
        System.out.println("Example 8: Find Middle Element");
        int[] arr8 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Array: " + Arrays.toString(arr8));
        System.out.println("Middle element: " + findMiddle(arr8) + "\n");

        // ===== PATTERN SUMMARY =====
        System.out.println("========== PATTERN SUMMARY ==========");
        System.out.println("Left-Right Pointer:");
        System.out.println("  - Use for: Sorted arrays, palindromes, two-sum problems");
        System.out.println("  - Start: Both ends, move towards center");
        System.out.println("  - Benefit: O(n) time, O(1) space\n");

        System.out.println("Slow-Fast Pointer:");
        System.out.println("  - Use for: Removing duplicates, partitioning, moving elements");
        System.out.println("  - Start: Same position, fast scans ahead");
        System.out.println("  - Benefit: In-place modification, O(n) time, O(1) space");
    }
}

