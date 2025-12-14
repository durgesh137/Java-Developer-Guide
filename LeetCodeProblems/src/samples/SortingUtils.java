package samples;

import java.util.Arrays;
import java.util.Random;

/**
 * Sorting Utility Methods
 *
 * This class provides helper methods for testing sorting problems:
 * - Array printing and formatting
 * - Test data generation
 * - Common validation functions
 * - Debugging utilities
 */
public class SortingUtils {

    private static final Random random = new Random();


    /**
     * Generate random integer array
     * @param size - number of elements
     * @param maxValue - maximum value (exclusive)
     * @return random integer array
     */
    public static int[] generateRandomArray(int size, int maxValue) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(maxValue);
        }
        return arr;
    }

    /**
     * Generate sorted integer array
     * @param size - number of elements
     * @param maxValue - maximum value
     * @return sorted integer array
     */
    public static int[] generateSortedArray(int size, int maxValue) {
        int[] arr = generateRandomArray(size, maxValue);
        Arrays.sort(arr);
        return arr;
    }

    /**
     * Check if array is sorted in ascending order
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if two arrays are equal
     */
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    /**
     * Detects if arrays are sorted in ascending or descending order
     */
    public static boolean detectSortOrder(int[] largerArray, int largerSize, int[] smallerArray, int smallerSize) {
        // Check larger array first
        if (largerSize >= 2) {
            return largerArray[0] <= largerArray[largerSize - 1];
        }
        // Check smaller array if larger has only one element
        if (smallerSize >= 2) {
            return smallerArray[0] <= smallerArray[smallerSize - 1];
        }
        // Default to ascending if both arrays have single elements
        return true;
    }

}

