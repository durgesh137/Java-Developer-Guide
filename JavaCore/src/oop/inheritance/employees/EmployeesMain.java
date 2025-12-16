package oop.inheritance.employees;

public class EmployeesMain {
    public static void main(String[] args) {
        System.out.println("============= Employees Information (inheritance,super, override) =============");
        Employee emp1 = new FullTimeEmployee("Alice", 60000, 5000);
        Employee emp2 = new PartTimeEmployee("Bob", 30000, 1200);
        Employee emp3 = new Developer("Charlie", 80000, 7000, "Java");
        Employee manager = new Manager("Diana", 90000, 10000, 5);

        emp1.displayInfo();
        System.out.println();
        emp2.displayInfo();
        System.out.println();
        emp3.displayInfo();
        System.out.println();
        manager.displayInfo();

    }
}

