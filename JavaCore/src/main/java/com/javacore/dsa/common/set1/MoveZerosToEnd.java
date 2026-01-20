package com.javacore.dsa.common.set1;

import com.javacore.concepts.streams.common.helpers.CommonUtils;

import java.util.Arrays;

/**
 * MoveZeros
 * - Passed all testcases on LEETCode
 */
public class MoveZerosToEnd {
    static void main(String[] args) {
        System.out.println("Move Zeros to End...");
        testcase1();
        testcase2();
    }

    private static void testcase2() {
        System.out.println("\n===========TEST CASE 2===========");
        int[] num = {1,0,1};
        System.out.println("Original Array: " + Arrays.toString(num));
        moveZeroesRelatedOrderMaintained(num);
        System.out.println("Result: "+Arrays.toString(num));
    }

    private static void testcase1() {
        int[] numsHavingZeroes = CommonUtils.getNumsHavingZeroes();
        System.out.println("Original Array: " + Arrays.toString(numsHavingZeroes));
        moveZeroesRelatedOrderMaintained(numsHavingZeroes);
        System.out.println("Result: "+Arrays.toString(numsHavingZeroes));
    }

    public static void moveZeroesRelatedOrderMaintained(int[] nums) {
        if(nums == null || nums.length == 1)
            return;
        int left = 0;
        int right = 1;
        int size = nums.length-1;
        while(left<right && right<=size){
            if(nums[left] ==0){
                if(nums[right] != 0){
                    swap(nums,left,right);
                    left++;
                }
                //here both left and right element is 0
                // idea is not to skip 0, hence move right one step ahead
            }else{
                left++;
            }
            right++;
        }
    }
    private static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void moveAllZerosRelativeOrderNotMaintained(int[] nums) {
        if(nums == null || nums.length == 1)
            return;
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            if(nums[left] == 0){
                if(nums[right] != 0){
                    swap(nums, left, right);
                    right--;
                    left++;
                }else{
                    //since 0s should go at end, hence reduce right
                    right--;
                }
            }else{
                left++;
            }
        }
    }
}

/**
 * Key Points-
 * 1. This problem comprises two solutions, both are working fine
 * - One solution does not maintain relative order of elements
 * - Approach comparing consecutive elements of array, maintains relative ordering.
 * 2. It is recommended to compare consecutive elements rather than comparing first and last element approach
 * - Both uses 2-pointer approach, but starting point controls relative ordering.
 */