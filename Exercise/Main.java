package com.company;

import com.company.entities.ClassRoom;
import com.company.entities.Student;
import com.company.entities.TechMaster;
import com.company.services.ClassService;
import com.company.services.StudentService;
import com.company.services.TechMasterService;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        TechMasterService techMasterService = new TechMasterService();
        ClassService classService = new ClassService();
        StudentService studentService = new StudentService();
        TechMaster techMaster = techMasterService.inputInfo(scanner);
        System.out.println("Nhập thông tin class của TechMaster: ");
        ClassRoom classRoom = classService.inputInfo(scanner);
        System.out.println("Nhập số học sinh có trong lớp học: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n ; i++){
            studentService.inputStudent(scanner,students);
        }
        classRoom.setStudents(students);
        techMaster.setClassRoom(classRoom);
        System.out.println(techMaster);
    }
}
