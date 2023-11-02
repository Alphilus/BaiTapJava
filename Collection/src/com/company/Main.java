package com.company;

import com.company.entities.Student;
import com.company.service.StudentManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.managementMenu(scanner, students);

    }
}
