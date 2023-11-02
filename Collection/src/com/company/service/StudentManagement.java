package com.company.service;

import com.company.entities.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagement {
    StudentService studentService = new StudentService();
    Map<Integer, Student> map = new HashMap<>();
    public void managementMenu(Scanner scanner, ArrayList<Student> students){
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
        } managementMenu(scanner, students);
    }

    public Student findStudentById(int id, ArrayList<Student> students){
        for (Student student : students){
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }

    public void deleteMenu(Scanner scanner, ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Nhập id của sinh viên mà bạn muốn xóa");
            int id = Integer.parseInt(scanner.nextLine());

            Student studentId = findStudentById(id, students);
            if (studentId == student) {
                System.out.println("Học sinh đã xóa thành công");
                deleteStudent(students);
            } else {
                System.out.println("Không tìm thấy học sinh");
            }
        }
    }

    public void deleteStudent(ArrayList<Student> students){
        for (Map.Entry<Integer, Student> entry: map.entrySet()){
            map.remove(entry.getKey());
        }
    }

    public void findStudent(Scanner scanner, ArrayList<Student> students){
        for (Student student : students) {
            System.out.println("Nhập id của sinh viên mà bạn muốn tìm");
            int id = Integer.parseInt(scanner.nextLine());

            Student studentId = findStudentById(id, students);
            if (studentId == student) {
                System.out.println("Học sinh đã tìm thấy thành công");
                getStudentById(id);
            } else {
                System.out.println("Không tìm thấy học sinh");
            }
        }
    }

    public void getStudentById(int id){
        map.get(id);
    }

    public void averageScore(ArrayList<Student> students){
        double sum = 0;
        for (Student student : map.values()){
            sum += student.getScore();
        }
        double average = sum / map.size();
        System.out.println(average);
    }
}
