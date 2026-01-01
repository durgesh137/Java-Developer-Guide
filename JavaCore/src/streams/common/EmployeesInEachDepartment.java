package streams.common;

import streams.common.helpers.CommonUtils;
import streams.common.helpers.Department;
import streams.common.helpers.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeesInEachDepartment {
    static void main(String[] args) {
        System.out.println("Employees In Each Department using Stream...");
        List<Employee> employees = CommonUtils.getUnmodifiableEmployees();
        Map<Department, Long> empsByDepartment = employees.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println("Result- Employees In Each Department:");
        empsByDepartment.forEach((dept, count) -> {
            String deptName = (dept != null) ? dept.getName() : "Unassigned / Bench";
            System.out.println(deptName + ": " + count);
        });

        System.out.println("\nEmployees count in each department in alphabetical order:");
        // to get results in alphabetical order
        empsByDepartment.entrySet().stream()
                // Sort by Department Name, putting NULL (Unassigned) at the top
                .sorted(Map.Entry.comparingByKey(
                        Comparator.nullsFirst(Comparator.comparing(Department::getName))
                ))
                .forEach(entry -> {
                    String name = (entry.getKey() != null) ? entry.getKey().getName() : "Unassigned";
                    System.out.println(name + ": " + entry.getValue());
                });
    }
}
