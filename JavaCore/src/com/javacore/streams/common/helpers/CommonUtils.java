package com.javacore.streams.common.helpers;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class CommonUtils {
    public static List<Employee> getUnmodifiableEmployees() {
        return Arrays.asList(
                new Employee(1L, "Samuel", 25, 45000.00, new Department(1, "Engineering", "NY"), "Developer", LocalDate.of(2020, 1, 15), true),
                new Employee(2L, "Tim", 30, 52000.50, new Department(2, "Sales", "LA"), "Sales Rep", LocalDate.of(2019, 6, 1), true),
                new Employee(3L, "Sam", 25, 48000.75, new Department(1, "Engineering", "NY"), "QA", LocalDate.of(2021, 3, 10), true),
                new Employee(4L, "Kiara", 35, 85000.00, new Department(3, "Finance", "SF"), "Manager", LocalDate.of(2018, 11, 5), true),
                new Employee(5L, "David", 40, 92000.25, new Department(3, "Finance", "SF"), "Director", LocalDate.of(2015, 7, 20), true),
                new Employee(6L, "Aisha", 25, 47000.00, new Department(4, "Marketing", "CHI"), "Coordinator", LocalDate.of(2022, 2, 14), true),
                new Employee(7L, "Liam", 32, 60000.00, new Department(2, "Sales", "LA"), "Account Exec", LocalDate.of(2017, 9, 30), true),
                new Employee(8L, "Olivia", 29, 58000.50, new Department(4, "Marketing", "CHI"), "Content", LocalDate.of(2021, 5, 18), true),
                new Employee(9L, "Noah", 26, 46000.00, new Department(1, "Engineering", "NY"), "DevOps", LocalDate.of(2023, 4, 1), true),
                new Employee(10L, "Emma", 32, 64000.00, new Department(5, "HR", "SEA"), "HR Specialist", LocalDate.of(2016, 12, 12), true),
                new Employee(10L, "Laura", 40, 88800, new Department(5, "HR", "LA"), "HR Specialist", LocalDate.of(2022, 12, 12), true)
        );
    }

    public static List<Integer> getUnmodifiableNumbers(){
        return Arrays.asList(100, 200, 3, 400, 51, 6, 700, 8, -900);
    }

    public static List<Integer> getUnmodifiableDuplicates(){
        return Arrays.asList(100, 200, 100, 200, 700, 6, 700, 8, -900);
    }

    public static List<Integer> getEvenLengthNumbers(){
        return Arrays.asList(1, 2, 400, 51, 60,
                            7, 8, -91, 10, 90);
    }

    public static List<Integer> getOddLengthNumbers(){
        return Arrays.asList(1, 2, 151, 56,
                            37, 18, -9,-31,
                            123, 1, 67);
    }

    public static int[] getNumsHavingZeroes(){
        return new int[]{0, 1, 2, 3,0, 4, 0,5, 6};
    }

}
