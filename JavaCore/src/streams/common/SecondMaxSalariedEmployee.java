package streams.common;

import streams.common.helpers.CommonUtils;
import streams.common.helpers.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SecondMaxSalariedEmployee {
    static void main(String[] args) {
        System.out.println("Employee Getting Second Max Salary");
        List<Employee> employees = CommonUtils.getUnmodifiableEmployees();

        employees.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .ifPresentOrElse(
                        emp ->System.out.print("Employee getting Second Max salary: "+emp),
                        () ->System.out.print("Employee Not Found")
                );
    }
}
