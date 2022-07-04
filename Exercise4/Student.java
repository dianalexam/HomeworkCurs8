package com.fasttrackit.Exercise4;

public class Student {
    private String name;
    private double grade;
    private static double sumGrades = 0;
    private static int numberStudents = 0;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        numberStudents += 1;
        sumGrades += grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public static double getAverageGrade() {
        return sumGrades / numberStudents;
    }
}
