package com.company.services;

import com.company.entities.ClassRoom;
import com.company.entities.TechMaster;

import java.util.Scanner;

public class TechMasterService {
    public TechMaster inputInfo(Scanner scanner){
        System.out.println("Nhập giáo viên: ");
        String teacher = scanner.nextLine();
        System.out.println("Nhập quản lý: ");
        String manager = scanner.nextLine();
        return new TechMaster(teacher, manager);
    }
}
