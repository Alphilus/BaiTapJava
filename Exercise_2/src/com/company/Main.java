package com.company;

import com.company.entities.Customer;
import com.company.entities.Receipt;
import com.company.service.ReceiptService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Receipt> receipts = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();

        ReceiptService receiptService = new ReceiptService();
        receiptService.inputBill(scanner, receipts, customers);
    }
}
