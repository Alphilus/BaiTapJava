package com.company.service;

import com.company.entities.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentService {
    Map<Integer, Student> map = new HashMap<>();
    public void addStudent(Scanner scanner, ArrayList<Student> students){
        System.out.println("Nhập thêm sinh viên");

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập điểm: ");
        double score = Double.parseDouble(scanner.nextLine());

        Student student = new Student(name, score);
        students.add(student);
        this.map.put(student.getId(), student);
    }
}
