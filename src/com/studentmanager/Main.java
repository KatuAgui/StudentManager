package com.studentmanager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Manager Application!");
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Doe", 85.5));
        students.add(new Student("Jane Smith", 90.0));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
