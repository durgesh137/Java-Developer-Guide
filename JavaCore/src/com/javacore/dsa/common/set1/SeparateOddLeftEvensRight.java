package com.javacore.dsa.common.set1;


import com.javacore.streams.common.helpers.CommonUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateOddLeftEvensRight {
    static void main(String[] args) {
        int[] nums = CommonUtils.getNumsHavingZeroes();
        System.out.println("Input: "+ Arrays.toString(nums));
        segregateOddsEvens(nums);
        System.out.println("Result: "+Arrays.toString(nums));

    }
    private static void segregateOddsEvens(int[] nums) {
        if(nums==null||nums.length==1){
            return;
        }
        int left = 0;
        int right=1;
        int size=nums.length;
        while(left<right && right<size){
            if(nums[left] % 2 != 0){
                left++;
            }else{
                //odd, should go at start
                if(nums[right] % 2 != 0){
                    swap(nums, left, right);
                    left++;
                    right++;
                }else{
                    //even
                    right++;
                }
            }
        }
    }

    private static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void separateOddsEvensWithStream(int[] nums){
        List<Integer> result = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        result.stream().filter(n -> n % 2 != 0).forEach(result::add);
        result.stream().filter(n -> n % 2 == 0).forEach(result::add);
    }
}
