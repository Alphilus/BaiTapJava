package com.company.services;

import com.company.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public void inputStudent(Scanner scanner, ArrayList<Student> students){
        System.out.println("Nhập tên học viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi học viên: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập học lực của học viên: ");
        String classify = scanner.nextLine();
        Student student = new Student(name, age, classify);
        students.add(student);
    }
}
