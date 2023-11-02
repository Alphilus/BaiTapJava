package com.company;

import com.company.entities.Student;
import com.company.service.StudentManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Student> students = new HashMap<>();
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.managementMenu(scanner, students);

    }
}
