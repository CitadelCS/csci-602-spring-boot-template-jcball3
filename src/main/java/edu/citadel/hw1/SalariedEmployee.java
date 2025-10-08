package edu.citadel.hw1;

import java.time.LocalDate;
import java.util.Objects;

// Subclass of Employee to represent Salaried Employees
public class SalariedEmployee extends Employee{
    // Private field to represent a Salaried Employee's annual salary
    private double annualSalary;

    // Public constructor to create a Salaried Employee
    public SalariedEmployee(String name, LocalDate hireDate, double annualSalary) {
        super(name, hireDate);
        this.annualSalary = annualSalary;
    }

    // Public get() method to return annualSalary
    public double getAnnualSalary() {
        return annualSalary;
    }

    // Method to compute and return monthly pay
    @Override
    public double getMonthlyPay() {
        return annualSalary / 12;
    }

    // Method to return a salaried employee's information in String format
    @Override
    public String toString() {
        return "SalariedEmployee[name=" + this.getName() + ", hireDate=" + this.getHireDate() + ", annualSalary=" + this.getAnnualSalary() + "]";
    }

    // equals() and hashCode() functions for comparison
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return Double.compare(annualSalary, that.annualSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), annualSalary);
    }
}