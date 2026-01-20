package com.javacore.concepts.streams.common;

import com.javacore.concepts.streams.common.helpers.CommonUtils;
import com.javacore.concepts.streams.common.helpers.Employee;

import java.util.List;
import java.util.Objects;

public class ExtractsIdsFromEmployees {
    static void main(String[] args) {
        System.out.println("Extract all employees ids from employees using Stream...");
        List<Employee> employees = CommonUtils.getUnmodifiableEmployees();
        System.out.println("original List: " + employees);

        List<Long> empIds = employees.stream()
                .filter(Objects::nonNull)
                .map(Employee::getId)
                .toList();
        System.out.println("Employees ids from stream: " + empIds);

    }
}

/**
 * Key Points-
 * 1. Here to get particular field from Employee, map() is used
 * - The map() function acts as a projection (similar to SELECT id in SQL).
 * - Since we are extracting Long IDs, this is an $O(n)$ operation with minimal memory overhead, provided the list size is manageable.
 * 2. In case duplicate IDs are possible, use distinct() after map()
 */