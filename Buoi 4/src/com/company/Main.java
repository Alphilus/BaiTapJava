package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);


//        Cách 1: Do While
//        int n = 0;
//
//        String y = "";
//
//        double sum = 0;
//
//        do {
//            System.out.println("Mời bạn nhập một số nguyên: ");
//            n = Integer.parseInt(scanner.nextLine());
//            n += n;
//            System.out.println("Do you want to continue? (Y/N)");
//            y = scanner.nextLine();
//        } while (y.equals("y"));
//        sum += n;
//        System.out.println("Tổng số là: " + sum);

//        Cách 2: While
//        String y = "";
//        double sum = 0;
//
//        System.out.println("Mời bạn nhập một số nguyên: ");
//        Double n = Double.parseDouble(scanner.nextLine());
//
//        sum += n;
//
//        System.out.println("Do you want to continue? (Y/N)");
//        y = scanner.nextLine();
//
//        while (y.equals("y")){
//            System.out.println("Mời bạn nhập một số nguyên: ");
//            n = Double.parseDouble(scanner.nextLine());
//            sum += n;
//            System.out.println("Do you want to continue? (Y/N)");
//            y = scanner.nextLine();
//        }
//        System.out.println("Tổng số là: " + sum);

//        Bài 2

        String YN = "";

        System.out.println("Please input information of a student");

        do {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Address: ");
            String address = scanner.nextLine();

            System.out.println("Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Student: " + name + " - " + address + " - " + age);

            System.out.println("Do you want to continue? (Y/N)");
            YN = scanner.nextLine();
        }while (YN.equals("y"));
        System.out.println("stop the program");
    }
}
