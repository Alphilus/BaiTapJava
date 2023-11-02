package com.company.service;

import com.company.entities.Student;

import java.util.Map;
import java.util.Scanner;

public class StudentManagement {
    StudentService studentService = new StudentService();
    public void managementMenu(Scanner scanner, Map<Integer, Student> students) {
        try {
            System.out.println("Student Management");
            System.out.println("1-Thêm sinh viên");
            System.out.println("2-Xóa sinh viên");
            System.out.println("3-Tìm sinh viên");
            System.out.println("4-Điểm trung bình");
            System.out.println("5-Thoát");

            int input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 1 -> studentService.addStudent(scanner, students);
                case 2 -> deleteMenu(scanner, students);
                case 3 -> findStudent(scanner, students);
                case 4 -> averageScore(students);
                case 5 -> System.exit(0);
                default -> {
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            managementMenu(scanner, students);
        }
    }

    public Student findStudentById(int id, Map<Integer, Student> students) {
        return students.get(id);
    }

    public void deleteMenu(Scanner scanner, Map<Integer, Student> students) {
        try {
            for (Map.Entry<Integer, Student> entry : students.entrySet()) {
                System.out.println("Nhập id của sinh viên mà bạn muốn xóa");
                int id = Integer.parseInt(scanner.nextLine());

                Student studentId = findStudentById(id, students);
                if (studentId == entry.getValue()) {
                    System.out.println("Học sinh đã xóa thành công");
                    students.remove(entry.getKey());
                } else {
                    System.out.println("Không tìm thấy học sinh");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void findStudent(Scanner scanner, Map<Integer, Student> students) {
        try {
            for (Map.Entry<Integer, Student> entry : students.entrySet()) {
                System.out.println("Nhập id của sinh viên mà bạn muốn tìm");
                int id = Integer.parseInt(scanner.nextLine());

                Student studentId = findStudentById(id, students);
                if (studentId == entry.getValue()) {
                    System.out.println("Học sinh đã tìm thấy thành công");
                    System.out.println(students);
                } else {
                    System.out.println("Không tìm thấy học sinh");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void averageScore(Map<Integer, Student> students) {
        try {
            double sum = 0;
            for (Student student : students.values()) {
                sum += student.getScore();
            }

            double average = sum / students.size();
            System.out.println(average);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
