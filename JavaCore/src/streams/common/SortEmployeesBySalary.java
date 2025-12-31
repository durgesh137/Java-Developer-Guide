package streams.common;

import streams.common.helpers.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortEmployeesBySalary {
    static void main(String[] args) {
        List<Employee> employees =  Arrays.asList(
                new Employee("Sam", 12345.12),
                new Employee("Tim", 34523.45),
                new Employee("Samuel", 56546.21),
                new Employee("Kiara", 6756566.12),
                new Employee("David", 234234.45)
        );
        System.out.println(employees);

        List<Employee> sortedEmployees = employees.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        System.out.println(sortedEmployees);
    }
}

/**
 * Key Point-
 * 1. Sorting part, Using Comparator.comparing method
 * 2. Using scope resolution operator to provide type for comparing employees, that is, salary
 * 3. Further calling reversed() to get results in descending order
 */