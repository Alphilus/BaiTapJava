package com.company.service;

import com.company.entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    public Customer inputReceipt(Scanner scanner, ArrayList<Customer> customers){
        System.out.println("Nhập hộ gia đình mới");

        System.out.println("Nhập tên chủ hộ gia đình :");
        String name = scanner.nextLine();

        System.out.println("Nhập sô nhà: ");
        int address = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập mã công tơ :");
        String code = scanner.nextLine();

        Customer customer = new Customer(name, address, code);
        customers.add(customer);
        return customer;
    }

    public void printInfo(ArrayList<Customer> customers){
        System.out.println(customers);
    }
}
