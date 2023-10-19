package com.company.services;

import com.company.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {

    public int displayMenu(Scanner scanner,ArrayList<Worker>workers){
        System.out.println("Menu:");
        System.out.println("1. Add new worker");
        System.out.println("2. Increase salary");
        System.out.println("3. Reduce salary");
        System.out.println("4. Display all workers");
        System.out.println("5. Exit");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                addNewWorker(scanner,workers);
                return displayMenu(scanner,workers);
            case 2:
                increaseSalary(scanner,workers);
                return displayMenu(scanner,workers);
            case 3:
                decreaseSalary(scanner,workers);
                return displayMenu(scanner,workers);
            case 4:
                displayAllWorkers(workers);
                return displayMenu(scanner,workers);
            case 5:
                System.exit(0);
            default:
                System.out.println("Invalid choice.");
        }

        return choice;
    }

    public void addNewWorker(Scanner scanner, ArrayList<Worker>workers){
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập lương:");
        Double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Worker worker = new Worker(id, name, age, salary, address);

        workers.add(worker);
    }

//    public void createWorkerList(Scanner scanner, ArrayList<Worker> workers){
//        String input = "";
//        do {
//            Worker worker = addNewWorker(scanner);
//            workers.add(worker);
//            System.out.println("Bạn có muốn thêm nhân viên không?(Y/N)");
//            input = scanner.nextLine();
//        }while (input.equalsIgnoreCase("y"));
//    }

    public void increaseSalary(Scanner scanner, ArrayList<Worker>workers){
        System.out.println("Enter the id of the employee you want to increase salary: ");
        int code = Integer.parseInt(scanner.nextLine());

        double increase;
        double sumSalary;
        for (int i = 0; i < workers.size(); i++){
            if (code == workers.get(i).getId()){
                System.out.println("Nhập số lương:");
                increase = Double.parseDouble(scanner.nextLine());
                sumSalary = workers.get(i).getSalary() + increase;
                workers.get(i).setSalary(sumSalary);
            }else break;
        }
        System.out.println("Id not found");
    }

    public void decreaseSalary(Scanner scanner, ArrayList<Worker>workers){
        System.out.println("Enter the id of the employee you want to decrease salary: ");
        int code = Integer.parseInt(scanner.nextLine());

        double decrease;
        double minSalary;
        for (int i = 0; i < workers.size(); i++){
            if (code == workers.get(i).getId()){
                System.out.println("Nhập số lương:");
                decrease = Double.parseDouble(scanner.nextLine());
                minSalary = workers.get(i).getSalary() - decrease;
                workers.get(i).setSalary(minSalary);
            }else break;
        }
        System.out.println("Id not found");
    }

    public void displayAllWorkers(ArrayList<Worker>workers){
        System.out.println(workers);
    }
}
