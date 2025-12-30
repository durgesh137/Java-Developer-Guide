package streams.basics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;

public class MaxMinElementInList {
    static void main(String[] args) {
        System.out.println("MaxMinElementInList using Streams:");
        List<Integer> nums = Arrays.asList(1, -2, 3, 4, 5, 6, 7, 8, 9, -10);
        OptionalInt max = nums.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println("Max value : "+max.getAsInt());

        OptionalInt min = nums.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println("Min value : "+min.getAsInt());

        //to perform multiple operations in one go like min(), max(), sum(), average()
        IntSummaryStatistics intSummaryStatistics = nums.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("Max value : "+intSummaryStatistics.getMax());
        System.out.println("Min value : "+intSummaryStatistics.getMin());
        System.out.println("Sum : "+intSummaryStatistics.getSum());
        System.out.println("Average : "+intSummaryStatistics.getAverage());

    }
}
