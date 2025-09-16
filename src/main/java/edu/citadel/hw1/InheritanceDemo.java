package edu.citadel.hw1;

import java.util.ArrayList;
import java.time.LocalDate; // Needed for LocalDate.of() method to work for dates
import java.util.Collections;

// Tester class to test the Employee class and its subclasses
public class InheritanceDemo {
    // Main class to run the demo
    public static void main(String [] args) {
        // ArrayList to store Employee objects
        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        // Create and store two Hourly Employees, John and Jane Doe
        employeeList.add(new HourlyEmployee("John Doe", LocalDate.of(2009, 5, 21), 50.5, 160.0));
        employeeList.add(new HourlyEmployee("Jane Doe", LocalDate.of(2005, 9, 1), 150.5, 80.0));

        // Create and store two Salaried Employees, Moe and Curly Howard
        employeeList.add(new SalariedEmployee("Moe Howard", LocalDate.of(2004, 1, 1), 75000.0));
        employeeList.add(new SalariedEmployee("Curly Howard", LocalDate.of(2018, 1, 1), 105000.0));

        // Print the list of employees before sorting, followed by a blank line
        System.out.println("List of Employees (before sorting)");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println();

        // Sort the list of employees using Collections, and then print out the list, followed by a blank line
        Collections.sort(employeeList);
        System.out.println("List of Employees (after sorting)");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println();

        // Print out the monthly pay for each employee, followed by the total monthly pay
        double totalPay = 0;
        System.out.println("Monthly Pay");
        for (Employee employee : employeeList) {
            totalPay += employee.getMonthlyPay();
            System.out.printf("%s: $%,.2f\n", employee.getName(), employee.getMonthlyPay());
        }
        System.out.printf("Total Monthly Pay: $%,.2f", totalPay);
    }
}
