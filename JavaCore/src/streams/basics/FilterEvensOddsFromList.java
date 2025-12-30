package streams.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterEvensOddsFromList {
    static void main(String[] args) {
        System.out.println("FilterEvensOddsFromList using Stream API");
        List<Integer> intList = Arrays.asList(1, 2, 30, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("IntList : "+intList);
        List<Integer> evens = intList.stream()
                .filter(i -> i % 2 == 0)
                .toList();
        System.out.println("Evens : "+evens);

        List<Integer> odds = intList.stream()
                .filter(i -> i % 2 != 0)
                .toList();
        System.out.println("Odds : "+odds);

        // finding even and odd in single stream operation
        Map<Boolean, List<Integer>> result = intList.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        System.out.println("Total evens : "+result.get(true).size());
        System.out.println("Total odds : "+result.get(false).size());

    }
}