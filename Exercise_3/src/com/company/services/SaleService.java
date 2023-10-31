package com.company.services;

import com.company.Utils.Utils;
import com.company.entities.Manager;
import com.company.entities.OfficeEmployee;
import com.company.entities.SalesEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleService {
    Utils utils = new Utils();
    public void inputSales(Scanner scanner, ArrayList<OfficeEmployee> employees){
        System.out.println("Input Employee name: ");
        String name = scanner.nextLine();

        System.out.println("Input salary: ");
        double salary = utils.inputDouble(scanner);

        System.out.println("Input sales bonus: ");
        double salesBonus = utils.inputDouble(scanner);

        System.out.println("Input bonus percentage: ");
        double percentBonus = utils.inputDouble(scanner);

        employees.add(new SalesEmployee(name, salary, salesBonus, percentBonus));
        System.out.println(employees);
    }
}
