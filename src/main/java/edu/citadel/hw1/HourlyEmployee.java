package edu.citadel.hw1;

import java.time.LocalDate;
import java.util.Objects;

// Subclass of Employee to represent Hourly Employees
public class HourlyEmployee extends Employee {
    // Private fields to represent an Hourly Employee's hourly rate and hours worked
    private double wageRate;
    private double hoursWorked;

    // Public constructor to create an Hourly Employee
    public HourlyEmployee(String name, LocalDate hireDate, double wageRate, double hoursWorked) {
        super(name, hireDate);
        this.wageRate = wageRate;
        this.hoursWorked = hoursWorked;
    }

    // Public get() methods to return wageRate and hoursWorked
    public double getWageRate() {
        return wageRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // Method to compute and return monthly pay
    @Override
    public double getMonthlyPay() {
        return wageRate * hoursWorked;
    }

    // Method to return an hourly employee's information in String format
    @Override
    public String toString() {
        return "HourlyEmployee[name=" + this.getName() + ", hireDate=" + this.getHireDate() + ", wageRate=" +
                this.getWageRate() +  ", hoursWorked=" + this.getHoursWorked() + "]";
    }

    // equals() and hashCode() functions for comparison
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return Double.compare(wageRate, that.wageRate) == 0 && Double.compare(hoursWorked, that.hoursWorked) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wageRate, hoursWorked);
    }
}