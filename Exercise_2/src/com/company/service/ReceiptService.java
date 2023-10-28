package com.company.service;

import com.company.entities.Customer;
import com.company.entities.Receipt;
import com.company.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class ReceiptService {
    CustomerService customerService = new CustomerService();
    Utils utils = new Utils();
    public void inputBill(Scanner scanner,ArrayList<Receipt> receipts ,ArrayList<Customer> customers){
            System.out.println("Mời bạn nhập số điện cũ: ");
            long oldNumber = utils.inputLong(scanner);

            System.out.println("Mời bạn nhập số điện mới: ");
            long newNumber = utils.inputLong(scanner);

            double electricBill = (newNumber - oldNumber) * 750;
            System.out.println("Số tiền phải trả: "+electricBill);

            System.out.println("Mời bạn nhập thông tin của hộ gia đình dùng điện: ");

            Customer customer = customerService.inputReceipt(scanner, customers);
            Receipt receipt = new Receipt(oldNumber, newNumber, electricBill, customer);
            receipts.add(receipt);
            printInfo(customers, receipts);
    }

    public void printInfo(ArrayList<Customer> customers, ArrayList<Receipt> receipts){
        customerService.printInfo(customers);
        System.out.println(receipts);
    }
}
