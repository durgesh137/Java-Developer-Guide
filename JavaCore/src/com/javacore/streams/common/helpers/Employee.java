package com.javacore.streams.common.helpers;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private long id;
    private String name;
    private int age;
    private double salary;
    private Department department;
    private String role;
    private LocalDate hireDate;
    private boolean active;

    public Employee(long id, String name, int age, double salary, Department department, String role, LocalDate hireDate, boolean active) {
        this.id = id;
        this.name = Objects.requireNonNull(name);
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.role = role;
        this.hireDate = hireDate;
        this.active = active;
    }

    public Employee(String name, double salary) {
        this(0L, name, 22, salary, null, null, LocalDate.now(), true);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(employee.salary, salary) == 0 &&
                Integer.compare(employee.age, age) == 0 &&
                active == employee.active &&
                Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department) &&
                Objects.equals(role, employee.role) &&
                Objects.equals(hireDate, employee.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, department, role, hireDate, active);
    }

    @Override
    public String toString() {
        return "[" + name + " (id=" + id + ") role=" + role +
                " dept=" + (department != null ? department.getName() : "none") +
                " earns=" + salary + " hired=" + hireDate + " active=" + active + "]";
    }
}
