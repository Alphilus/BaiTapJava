package com.company.services;

import com.company.Utils.Utils;
import com.company.entities.OfficeEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    Utils utils = new Utils();
    EmployeeService employeeService = new EmployeeService();
    SaleService saleService = new SaleService();
    ManagerService managerService = new ManagerService();
    public void inputMenu(Scanner scanner, ArrayList<OfficeEmployee> employees){
        System.out.println("Menu");
        System.out.println("1-Nhập nhân viên hành chính");
        System.out.println("2-Nhập nhân viên tiếp thị");
        System.out.println("3-Nhập trưởng phòng");
        System.out.println("4-Xuất danh sách nhân viên");
        System.out.println("5-Cập nhập nhân viên");
        System.out.println("6-Xóa nhân viên");
        System.out.println("7-Thoát");

        int input = Integer.parseInt(scanner.nextLine());

        switch (input) {
            case 1 -> employeeService.inputEmployee(scanner, employees);
            case 2 -> saleService.inputSales(scanner, employees);
            case 3 -> managerService.inputManager(scanner, employees);
            case 4 -> {
                System.out.println(employees);
            }
            case 5 -> employeesUpdate(scanner, employees);
            case 6 -> deleteEmployee(scanner, employees);
            case 7 -> System.exit(0);
            default -> {
            }
        } inputMenu(scanner, employees);
    }

    private OfficeEmployee checkId(int id, ArrayList<OfficeEmployee> employees){
        for (OfficeEmployee employee : employees){
            if (employee.getId() == id){
                return employee;
            }
        }
        return null;
    }

    public void employeesUpdate(Scanner scanner, ArrayList<OfficeEmployee> employees){
        System.out.println("Nhập id của nhân viên mà bạn muốn cập nhập :");
        for (OfficeEmployee employee : employees) {
            int findID = Integer.parseInt(scanner.nextLine());

            OfficeEmployee employeeCheck = checkId(findID,employees);
            if (employeeCheck == employee){
                System.out.println("Nhân viên được tìm thấy");
                updateMenu(scanner, employees);
            } else {
                System.out.println("Nhân viên không được tìm thấy");
            }
            inputMenu(scanner, employees);
        }
    }

    public void updateMenu(Scanner scanner, ArrayList<OfficeEmployee> employees){
        for (OfficeEmployee employee : employees) {
        System.out.println("1-Đổi tên");
        System.out.println("2-Đổi lương");
        System.out.println("3-Thoát");
        int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1 -> {
                    System.out.println("Tên mới");
                    String name = scanner.nextLine();
                    employee.setName(name);
                }
                case 2 -> {
                    System.out.println("Lương mới");
                    double salary = utils.inputDouble(scanner);
                    employee.setSalary(salary);
                }
                case 3 -> inputMenu(scanner, employees);
                default -> {
                }
            }
        }
        inputMenu(scanner, employees);
    }

    public void deleteEmployee(Scanner scanner, ArrayList<OfficeEmployee> employees){
        System.out.println("Nhập id của nhân viên mà bạn muốn xóa :");
        for (OfficeEmployee employee : employees) {
            int findID = Integer.parseInt(scanner.nextLine());

            OfficeEmployee employeeCheck = checkId(findID,employees);
            if (employeeCheck == employee){
                System.out.println("Nhân viên được tìm thấy");
                deleteMenu(scanner, employees);
            } else {
                System.out.println("Nhân viên không được tìm thấy");
            }
        }
        inputMenu(scanner, employees);
    }

    public void deleteMenu(Scanner scanner, ArrayList<OfficeEmployee> employees){
        for (OfficeEmployee employee : employees) {
            if (employees.contains(employee)){
                employees.removeAll(Collections.singleton(employee));
            }
        }
    }
}
