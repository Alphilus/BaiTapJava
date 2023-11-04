package com.company.services;

import com.company.entities.Login;

import java.util.Map;
import java.util.Scanner;

public class Menu {
    LoginService loginService = new LoginService();

    public void inputMenu(Scanner scanner, Map<String, Login> stringLoginMap) {
        try {
            System.out.println("Menu");

            System.out.println("1-Đăng ký tài khoản mới");
            System.out.println("2-Đăng nhập");
            System.out.println("3-Thoát");

            int input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 1 -> loginService.register(scanner, stringLoginMap);
                case 2 -> {
                    loginService.login(scanner, stringLoginMap);
                    System.exit(0);
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Input sai");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            inputMenu(scanner, stringLoginMap);
        }
    }
}
