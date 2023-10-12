package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
//        Bài 1
//        System.out.println("Nhập side: ");
//        int side = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập length: ");
//        int length = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập width: ");
//        int width = Integer.parseInt(scanner.nextLine());
//
//        double perimeter = (width + length) * 2;
//        double arceage = width*length;
//        Rectangle rectangle = new Rectangle(side, length, width);
//        System.out.println(rectangle);
//
//        System.out.println("Chu vi là: " + perimeter);
//        System.out.println("Diện tích là: " + arceage);

//        Bài 2
        System.out.println("Nhập tên bác sỹ: ");
        String doctorName = scanner.nextLine();
        System.out.println("Nhập id bác sỹ: ");
        int doctorId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chuyên khoa bác sỹ: ");
        String special = scanner.nextLine();
        System.out.println("Nhập số giờ làm việc của bác sỹ: ");
        int workHours = Integer.parseInt(scanner.nextLine());

        Doctor doctor = new Doctor(doctorId, doctorName, special, workHours);
        System.out.println(doctor);

        System.out.println("Nhập tên bệnh nhân: ");
        String patientName = scanner.nextLine();
        System.out.println("Nhập id bệnh nhân: ");
        int patientId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số bệnh án của bệnh nhân: ");
        int record = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày nhập viện của bệnh nhân: ");
        int day = Integer.parseInt(scanner.nextLine());

        Patient patient = new Patient(record, day, patientName, patientId);
        System.out.println(patient);

    }
}
