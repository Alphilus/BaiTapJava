package com.company.services;

import com.company.entities.ClassRoom;

import java.util.Scanner;

public class ClassService {
    public ClassRoom inputInfo(Scanner scanner){
        System.out.println("Nhập môn học: ");
        String subject = scanner.nextLine();
        return new ClassRoom(subject);
    }
}
