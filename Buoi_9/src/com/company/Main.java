package com.company;

import com.company.entities.Worker;
import com.company.services.WorkerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        ArrayList<Worker> workers = new ArrayList<>();

        WorkerService workerService = new WorkerService();
        workerService.displayMenu(scanner, workers);

    }
}
