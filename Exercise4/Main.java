package com.fasttrackit.Exercise4;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Daniel", 10.0);
        Student student2 = new Student("Daniela", 9.5);
        Student student3 = new Student("Mihaela", 7.5);
        Student student4 = new Student("Mihai", 6.8);
        Student student5 = new Student("Andrei", 5.2);
        Student student6 = new Student("Andreea", 8.0);

        System.out.println(student1.getName());
        System.out.println(student1.getGrade());
        System.out.println(student2.getName());
        System.out.println(student2.getGrade());
        System.out.println(student3.getName());
        System.out.println(student3.getGrade());
        System.out.println(student4.getName());
        System.out.println(student4.getGrade());
        System.out.println(student5.getName());
        System.out.println(student5.getGrade());
        System.out.println(student6.getName());
        System.out.println(student6.getGrade());

        System.out.println(Student.getAverageGrade());
    }
}
