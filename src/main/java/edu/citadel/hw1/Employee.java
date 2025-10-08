package edu.citadel.hw1;

import java.time.LocalDate;
import java.util.Objects;

// Abstract class used to represent an Employee
public abstract class Employee implements Comparable<Employee> {
    // Private fields for employee name and date of hire
    private String name;
    private LocalDate hireDate;

    // Public constructor to create Employee object using name and hireDate
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    // Public get() methods to retrieve Employee name and hireDate
    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    // Abstract method to retrieve monthly pay; to be overridden in subclasses
    abstract public double getMonthlyPay();

    // Method that returns 1 if the current employee's salary is >= the employee passed in, otherwise -1
    public int compareTo(Employee employee) {
        if (this.getMonthlyPay() < employee.getMonthlyPay()) {
            return -1;
        }
        else {
            return 1;
        }
    }

    // equals() and hashCode() functions for comparison
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(hireDate, employee.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hireDate);
    }
}
