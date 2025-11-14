package com.example.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstration of Lambda Expressions for sorting Employee objects
 * Shows various sorting strategies using lambda syntax
 */
public class EmployeeSortingDemo {
    
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 75000.00));
        employees.add(new Employee("Bob", 25, 65000.00));
        employees.add(new Employee("Charlie", 35, 85000.00));
        employees.add(new Employee("Diana", 28, 70000.00));
        employees.add(new Employee("Eve", 32, 80000.00));
        
        System.out.println("========================================");
        System.out.println("EMPLOYEE SORTING USING LAMBDA EXPRESSIONS");
        System.out.println("========================================\n");
        
        // Original list
        System.out.println("Original Employee List:");
        printEmployees(employees);
        
        // 1. Sort by Name (Alphabetical)
        System.out.println("\n1. SORTED BY NAME (Alphabetical):");
        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        printEmployees(employees);
        
        // 2. Sort by Age (Ascending)
        System.out.println("\n2. SORTED BY AGE (Ascending):");
        employees.sort((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        printEmployees(employees);
        
        // 3. Sort by Salary (Ascending)
        System.out.println("\n3. SORTED BY SALARY (Ascending):");
        employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        printEmployees(employees);
        
        // 4. Sort by Salary (Descending)
        System.out.println("\n4. SORTED BY SALARY (Descending):");
        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        printEmployees(employees);
        
        // 5. Alternative: Using Comparator.comparing() with method references
        System.out.println("\n5. USING COMPARATOR.COMPARING() - Sorted by Name:");
        employees.sort(Comparator.comparing(Employee::getName));
        printEmployees(employees);
        
        // 6. Reverse order using reversed()
        System.out.println("\n6. SORTED BY AGE (Descending) using reversed():");
        employees.sort(Comparator.comparing(Employee::getAge).reversed());
        printEmployees(employees);
        
        System.out.println("\n========================================");
        System.out.println("Lambda Expression Sorting Demo Complete!");
        System.out.println("========================================");
    }
    
    /**
     * Helper method to print employee list
     */
    private static void printEmployees(List<Employee> employees) {
        for (Employee emp : employees) {
            System.out.println("  " + emp);
        }
    }
}
