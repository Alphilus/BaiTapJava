package com.company.services;

import com.company.Utils.Utils;
import com.company.entities.Manager;
import com.company.entities.OfficeEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerService {
    Utils utils = new Utils();
    public void inputManager(Scanner scanner, ArrayList<OfficeEmployee> employees){
        System.out.println("Input Employee name: ");
        String name = scanner.nextLine();

        System.out.println("Input salary: ");
        double salary = utils.inputDouble(scanner);

        System.out.println("Input responsibility salary: ");
        double responseSalary = utils.inputDouble(scanner);

        employees.add(new Manager(name, salary, responseSalary));
        System.out.println(employees);
    }
}
