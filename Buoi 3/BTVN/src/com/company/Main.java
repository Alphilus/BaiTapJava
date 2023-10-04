package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: ");
        String name = scanner.nextLine();

        System.out.println("Password: ");
        String pass = scanner.nextLine();

        String NameSys = "techmaster";
        String PassSys = "hoclacoviec";
        if (name.equals(NameSys) && pass.equals(PassSys)){
            System.out.println("Đăng nhập thành công");
        } else {
            System.out.println("Tài khoản không tồn tại, vui long thử lại");
        }
    }
}
