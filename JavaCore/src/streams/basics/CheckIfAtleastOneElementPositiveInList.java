package streams.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfAtleastOneElementPositiveInList {
    static void main(String[] args) {
        System.out.println("Check if Atleast one element is positive within list using Stream");
        List<Integer> list = new ArrayList<Integer>();

        //checking default behaviour of anyMatch on empty list first
        boolean result = list.stream()
                .anyMatch(x -> x > 0);
        System.out.println("Atleast one positive: "+result);//false

        list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        result = list.stream()
                .anyMatch(x -> x > 0);
        System.out.println("Atleast one positive: "+result);//true
    }
}