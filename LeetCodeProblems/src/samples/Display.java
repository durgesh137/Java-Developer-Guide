package samples;

import java.util.Arrays;

public class Display {
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printBothArrays(int[] arr1, int[] arr2) {
        System.out.print("Array 1: ");
        printArray(arr1);
        System.out.print("Array 2: ");
        printArray(arr2);
    }

    /**
     * Print separator line for output formatting
     */
    public static void printSeparator() {
        System.out.println("----------------------------------------");
    }

    /**
     * Print test case header
     */
    public static void printTestCase(int testNumber) {
        System.out.println("\n=== Test Case " + testNumber + " ===");
    }

    /**
     * Print integer array with label
     */
    public static void printArray(String label, int[] arr) {
        System.out.println(label + ": " + Arrays.toString(arr));
    }

}
