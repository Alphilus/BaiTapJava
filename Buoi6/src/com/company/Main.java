package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập side: ");
        int side = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập length: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập width: ");
        int width = Integer.parseInt(scanner.nextLine());

        double perimeter = (width + length) * 2;
        double arceage = width*length;
        Rectangle rectangle = new Rectangle(side, length, width);
        System.out.println(rectangle);

        System.out.println("Chu vi là: " + perimeter);
        System.out.println("Diện tích là: " + arceage);
    }
}
