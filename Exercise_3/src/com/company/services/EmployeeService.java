package com.company.services;

import com.company.Utils.Utils;
import com.company.entities.OfficeEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
    Utils utils = new Utils();
    public void inputEmployee(Scanner scanner, ArrayList<OfficeEmployee> employees){
        System.out.println("Input Employee name: ");
        String name = scanner.nextLine();

        System.out.println("Input salary: ");
        double salary = utils.inputDouble(scanner);

        employees.add(new OfficeEmployee(name, salary));
        System.out.println(employees);
    }
}
