package com.javacore.dsa.common.set1;

import java.util.Arrays;
import java.util.Objects;

/**
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 *
 *Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 *
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 *
 * Example 3:
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 *
 * - PASSED ALL TEST CASES ON LEET-CODE
 * - https://leetcode.com/problems/plus-one/submissions/1870998631/?envType=daily-question&envId=2026-01-01
 */
public class PlusOne {
    static void main(String[] args) {
        System.out.println("Adding one To Big Integer...");
        int[] num1 = new int[] {9};
        System.out.println("Input 1: "+Arrays.toString(num1));
        int[] result =addOne(num1);
        System.out.println("Result 1: "+Arrays.toString(result));

        int[] num2 = new int[] {9,9};
        System.out.println("\nInput 2: "+Arrays.toString(num2));
        result = addOne(num2);
        System.out.println("Result 2: "+Arrays.toString(result));

        int[] num3 = new int[] {9,9,9,0};
        System.out.println("\nInput 2: "+Arrays.toString(num3));
        result = addOne(num3);
        System.out.println("Result 3: "+Arrays.toString(result));


    }

    private static int[] addOne(int[] num1) {
        if(Objects.isNull(num1) || num1.length == 0){
            return num1;
        }
        int sum = 0;
        int adder = 1;
        int carry = 0;
        //999
        for (int i = num1.length - 1; i >= 0; i--) {
            sum = sum + num1[i] + carry + adder;//10
            if(sum > 9){
                carry = 1;
                sum = sum - 10;//0
                num1[i] = sum;//0
                adder = 0;//0
            }else{
                carry = 0;
                adder = 0;
                num1[i] = sum;
                sum = 0;
            }
        }
        if(carry == 1){
            //below JVM is automatically populating int[] with 0
            int [] newNum = new int[num1.length + 1];
            newNum[0] = carry;
            return newNum;
        }else{
            return num1;
        }
    }
}

/**
 * Key Points-
 * 1. Possible optimization, would be to reduce number of variables use within this approach
 */