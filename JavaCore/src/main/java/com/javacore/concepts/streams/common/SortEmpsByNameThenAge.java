package com.javacore.concepts.streams.common;

import com.javacore.concepts.streams.common.helpers.CommonUtils;
import com.javacore.concepts.streams.common.helpers.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortEmpsByNameThenAge {
    static void main(String[] args) {
        System.out.println("SortEmployees ByNameThenAge using Stream...");
        List<Employee> employees = CommonUtils.getUnmodifiableEmployees();
        System.out.println("UnmodifiableEmployees: " + employees);

        List<Employee> sortedResult = employees.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getAge))
                .toList();
        System.out.println("Employees after sorting then by Name and Age: ");
        sortedResult
                .forEach(emp -> System.out.print(emp.getName() + " " + emp.getAge()+","));

        System.out.println("\nApproach 2: ");
        //to minimize boxing/unboxing and reducing number of objects use
        employees.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Employee::getName)
                        //reducing boxing operation here, int->Integer conversion
                        .thenComparingInt(Employee::getAge))//
                .forEach(emp -> System.out.print(emp.getName() + " " + emp.getAge()+","));

    }
}

/**
 * Key Points-
 * 1. The Int version prevents the JVM from boxing the primitive int age into an Integer object
 * during every comparison, reducing the allocation rate and preventing minor delays.
 * 2. using sorted() to results in sorted order
 * 3. Comparator.comparing to sort based on name
 * 4. Further thenComparingInt, to use primitives for further sorting
 *
 * 5. Approach 1 uses thenComparing where boxing needs to be done, hence more load on GC.
 */