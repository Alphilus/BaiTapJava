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

        String SysName = "techmaster";
        String SysPass = "hoclacoviec";
        if (name.equals(SysName) && pass.equals(SysPass)){
            System.out.println("Đăng nhập thành công");
        } else {
            System.out.println("Tài khoản không tồn tại, vui long thử lại");
        }
    }
}
