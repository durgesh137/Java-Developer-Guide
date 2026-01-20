package com.javacore.concepts.streams.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FindElementsProductUsingReduce {
    static void main(String[] args) {
        System.out.println("Find elements product using reduce method");
        List<Integer> list = Arrays.asList( 2, 3, 4, 1, 5, null);
        Integer result = list.stream()
                .filter(Objects::nonNull)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product of Numbers: "+result);

        int result2 = list.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .reduce(1, (a, b) -> a * b);
        System.out.println("II Product of Numbers: "+result2);
    }
}

/*
 * Working of reduce method-
 * Step  | Operation Type  | a (Accumulator/Identity) | b (Current Element) | Result of a * b
 * ------|-----------------|--------------------------|---------------------|-----------------
 * Start | Initialization  | 1 (Identity)             | -                   | 1 (Partial Result)
 * 1     | Accumulation    | 1                        | 2                   | 2
 * 2     | Accumulation    | 2                        | 3                   | 6
 * 3     | Accumulation    | 6                        | 4                   | 24
 * 4     | Accumulation    | 24                       | 1                   | 24
 * 5     | Accumulation    | 24                       | 5                   | 120
 */

/**
 * Key Points-
 * 1.Boxing Overhead:
 * In a high-throughput system, using Stream<Integer> with reduce is often rejected for math.
 * - Every multiplication step involves unboxing Integer to int and boxing back to Integer.
 * - For millions of records, use mapToInt(i -> i).reduce(1, (a, b) -> a * b) to stay in the primitive domain.
 *
 * 2. Default behaviour:
 * The reduce() method  visits every element at least once.
 *
 * 3. Performance Trade-off:
 * - Using Integer involves constant boxing/unboxing.
 * - For a high-performance system, prefer using to mapToInt(i -> i) followed by reduce(1, (a, b) -> a * b)
 * to stay in the primitive domain
 *
 * 4. Possible errors-
 * - with mapToInt also we get Null Pointer Exception if it is not handled or filtered
 * - Exception in thread "main" java.lang.NullPointerException
 * 	at java.base/java.util.stream.IntPipeline.reduce(IntPipeline.java:517)
 * 	at streams.basics.FindElementsProductUsingReduce.main(FindElementsProductUsingReduce.java:18)
 */
