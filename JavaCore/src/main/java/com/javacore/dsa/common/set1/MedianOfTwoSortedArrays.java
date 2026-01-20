package com.javacore.dsa.common.set1;

import java.util.Arrays;
import java.util.Objects;

/**
 *  Median of Two Sorted arrays-
 *  PASSED ALL TEST CASES on LEETCODE-
 *  https://leetcode.com/problems/median-of-two-sorted-arrays/description/?envType=problem-list-v2&envId=array
 *  - only all methods are made static to avoid creating objects specifically
 */
public class MedianOfTwoSortedArrays {
    static void main(String[] args) {
        System.out.println("Finding Median of Two SortedArrays");
        executeTest1();
        executeTest2();
    }

    /**
     * finding the median on two sorted array
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //validate nulls first
        if(!Objects.isNull(nums1) && !Objects.isNull(nums2)){
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            //put content of both array in new array in sorted manner
            int[] merge = mergeBothArraysInSortedForm(nums1,nums2);
            return median(merge);
        }else if(Objects.isNull(nums1) && Objects.nonNull(nums2)){
            Arrays.sort(nums2);
            return median(nums2);
        }else{
            Arrays.sort(nums1);
            return median(nums1);
        }
    }

    /**
     * core logic to find the median on natural sorted array
     * @param merge
     * @return
     */
    private static double median(int[] merge) {
        // System.out.println("Sorted[]: "+Arrays.toString(merge));
        int size = merge.length;
        if(size % 2 == 0)
            return (merge[size / 2] + merge[(size-1) / 2 ])/2.0;
        else
            return merge[(size-1) / 2];
    }

    /**
     * merging content of both sorted array in natural order i.e. ascending order
     * @param leftOne
     * @param rightOne
     * @return
     */
    private static int[] mergeBothArraysInSortedForm(int[] leftOne, int[] rightOne){
        int size = leftOne.length + rightOne.length;
        int[] merge = new int[size];
        int left =0, right = 0;
        int index = 0;
        while (left < leftOne.length && right < rightOne.length){
            if(leftOne[left] < rightOne[right]){
                merge[index++] = leftOne[left++];
            }else{
                merge[index++] = rightOne[right++];
            }
        }
        //put all elements still there in left one
        while(left < leftOne.length){
            merge[index++] = leftOne[left++];
        }
        //put all elements still there in right one
        while(right < rightOne.length){
            merge[index++] = rightOne[right++];
        }
        return merge;
    }

    private static void executeTest1() {
        System.out.println("\n==============Case 1==============");
        //working on even size arrays first
        int[] one = new int []{5, 6, 1, 3, 8, 7};
        int[] two = new int []{4, 10, 1, 3, 5, 11};
        System.out.println("Array1: "+Arrays.toString(one));
        System.out.println("Array2: "+Arrays.toString(two));
        double result = findMedianSortedArrays(one,two);
        System.out.println("Median: "+result);

    }

    private static void executeTest2() {
        System.out.println("\n==============Case 2==============");
        //working on even size arrays first
        int[] one = new int []{1, 3};
        int[] two = new int []{2};
        System.out.println("Array1: "+Arrays.toString(one));
        System.out.println("Array2: "+Arrays.toString(two));
        double result = findMedianSortedArrays(one,two);
        System.out.println("Median: "+result);
    }

}
