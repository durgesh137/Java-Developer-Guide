package problems.easy;

import samples.Display;

/**
 * LeetCode #88 - Merge Sorted Array - Easy (Two Pointer Pattern, Merge from End)
 You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 representing the number of elements in nums1 and nums2 respectively.
 Merge nums1 and nums2 into a single array sorted in non-decreasing order.

 The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 *
 * Example 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Time: O(m+n) | Space: O(1)
 */
public class Problem001_MergeSortedArray {

    /**
     * Approach 1: Merge from end (Optimal)
     * Start merging from the end to avoid overwriting elements
     *
     * Time Complexity: O(m + n)
     * Space Complexity: O(1) - in-place
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /**
         * num1 is always m+n size
         * here m represents elements that should be merged
         * while last n elements are set to 0
         * Also n represent size of num2
         */
        int[] largerArray, smallerArray;
        int largerSize, smallerSize;

        if(m==0)return;
        if(nums1.length == 1){
        // num1 always has size m+n
            if(n == 0 || nums2[0] == 0)return;
            else{
                nums1[0]=nums2[0];
                return;
            }
        }
        if(m<=0 || n<=0){
            return; //nothing to merge
        }else if(m==1 && n==1){
            System.out.println("Both arrays have single element each");
            if(nums1[0] > nums2[0]){
                //nums1 already has smaller element at start
                return;
            }else{
                nums1[0] = nums2[0];
                return;
            }
        }
        else if (m >= n) {
            largerArray = nums1;
            smallerArray = nums2;
            largerSize = m;//0
            smallerSize = n;//1
        } else {
            largerArray = nums2;
            smallerArray = nums1;
            largerSize = n;
            smallerSize = m;
        }

        // Validate that largerArray has enough space
        if (largerArray.length < largerSize + smallerSize) {
            throw new IllegalArgumentException("Larger array does not have enough space to accommodate both arrays.");
        }

        if(largerArray.length == 1){
            System.out.println("Single element array case "+smallerArray[0]);
            if(largerArray[0] == 0)
                largerArray[0]=smallerArray[0];
            return;//nothing to merge
        }
        // Initialize pointers
        int pointer1 = largerSize - 1;
        int pointer2 = smallerSize - 1;
        int mergedArrayPointer = largerSize + smallerSize - 1;

        // Merge in reverse order - comparing elements from both arrays
        while (pointer1 >= 0 && pointer2 >= 0) {
            if (largerArray[pointer1] >= smallerArray[pointer2]) {
                largerArray[mergedArrayPointer] = largerArray[pointer1];
                pointer1--;
            } else {
                largerArray[mergedArrayPointer] = smallerArray[pointer2];
                pointer2--;
            }
            mergedArrayPointer--;
        }

        // Copy remaining elements from smallerArray if any
        while (pointer2 >= 0) {
            largerArray[mergedArrayPointer] = smallerArray[pointer2];
            pointer2--;
            mergedArrayPointer--;
        }

    }


    public static void main(String[] args) {
        // these testcases ensure given array are always in ascending order, as per the problem statement
        Problem001_MergeSortedArray solution = new Problem001_MergeSortedArray();
        System.out.println("Merge Sorted Array Test Cases\n");
        // Test Case 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        Display.printTestCase(1);
        Display.printBothArrays(nums1, nums2);
        solution.merge(nums1, 3, nums2, 3);
        System.out.println("Test 1: Expected [1,2,2,3,5,6]");
        Display.printArray(nums1);

        //checking for other way round, in case smaller array is first, IndexOutOfBoundsException should not occur
        Display.printSeparator();
        Display.printTestCase(2);
        nums1 = new int[]{1};
        nums2 = new int[] {};
        Display.printBothArrays(nums1, nums2);
        solution.merge(nums1, 1, nums1, 1);
        System.out.println("Test 2: Expected [1]");
        Display.printArray(nums1);

        //checking for other way round, in case smaller array is first, IndexOutOfBoundsException should not occur
        Display.printSeparator();
        Display.printTestCase(3);
        nums1 = new int[]{0};//size 1, m=0
        nums2 = new int[] {1};
        Display.printBothArrays(nums1, nums2);
        solution.merge(nums1, 0, nums2, 1);
        System.out.println("Test 2: Expected [1]");
        Display.printArray(nums1);

        Display.printSeparator();
        Display.printTestCase(2);
        nums1 = new int[] {210, 101, 61};
        nums2 = new int[]{101, 81, 31, 0, 0, 0};
        Display.printBothArrays(nums2, nums1);
        //num1 is already greater in length
        solution.merge(nums2, 3, nums1, 3);
        System.out.println("Test 2: Expected [1,2,2,3,5,6]");
        Display.printArray(nums1);
        // Add more test cases
    }
}


