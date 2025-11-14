package com.example.streams;

/**
 * Student class for Stream API demonstrations
 * Contains name and marks fields
 */
public class Student {
    private String name;
    private double marks;

    // Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // toString for easy printing
    @Override
    public String toString() {
        return String.format("Student{name='%s', marks=%.2f}", name, marks);
    }
}
