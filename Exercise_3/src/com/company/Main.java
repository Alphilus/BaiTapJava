package com.company;

import com.company.entities.Manager;
import com.company.entities.OfficeEmployee;
import com.company.services.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Bài 1
        Scanner scanner = new Scanner(System.in);
        ArrayList<OfficeEmployee> employees = new ArrayList<>();
        Menu menu = new Menu();
        menu.inputMenu(scanner, employees);
        System.out.println(employees);
//        Bài 2

    }
}
