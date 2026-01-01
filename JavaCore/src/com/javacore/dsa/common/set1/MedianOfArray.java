package com.javacore.dsa.common.set1;

import com.javacore.streams.common.helpers.CommonUtils;

import java.util.List;

public class MedianOfArray {
     static void main(String[] args) {
        System.out.println("Find Median of array");
        List<Integer> oddNums = CommonUtils.getOddLengthNumbers();
        printMedians(oddNums);
        List<Integer> evenNums = CommonUtils.getEvenLengthNumbers();
        printMedians(evenNums);
    }

    private static void printMedians(List<Integer> nums) {
        System.out.println("\nInput: "+nums+"\ninput size: "+nums.size());
        double result = findMedian(nums);
        System.out.println("Median: "+result);
    }

    private static double findMedian(List<Integer> nums) {
        if(nums == null || nums.isEmpty()){
            return 0;
        }
        int size = nums.size();
        List<Integer> sortedOne = nums.stream()
                .sorted().toList();
        System.out.println("Sorted: "+sortedOne);
        //first sort the array in ascending/natural order
        if(size % 2 == 0){
            double sum = sortedOne.get(size / 2) + sortedOne.get((size-1) / 2);
            //even, median is average of two central elements
            return sum/2.0;
        }else{
            //odd, median is middle element
            return  sortedOne.get((size - 1) / 2);
        }
    }
}
