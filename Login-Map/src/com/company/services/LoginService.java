package com.company.services;

import com.company.entities.Login;

import java.util.Map;
import java.util.Scanner;

public class LoginService implements ILogin<Login>{


    @Override
    public void register(Scanner scanner, Map<String, Login> stringLoginMap) {
        System.out.println("Tạo tài khoản mới");

        System.out.println("Tạo tên đăng nhập: ");
        String userName = scanner.nextLine();
        try {
            if (stringLoginMap.containsKey(userName)) {
                System.out.println("Tên người dùng này đã đăng ký rồi");
                register(scanner, stringLoginMap);
                return;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Tạo mật khẩu: ");
        String password = scanner.nextLine();

        Login login = new Login(userName, password);
        stringLoginMap.put(login.getUserName(), login);
    }

    @Override
    public void login(Scanner scanner, Map<String, Login> stringLoginMap) {
        System.out.println("Đăng Nhập");

        System.out.println("Nhập tên đăng nhập: ");
        String userName = scanner.nextLine();
        try {
            if (!stringLoginMap.containsKey(userName)) {
                System.out.println("Tên đăng nhập không tồn tại");
                login(scanner, stringLoginMap);
                return;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Nhập mật khẩu đăng nhập: ");
        String password = scanner.nextLine();
        try {
            if (!stringLoginMap.get(userName).getPassword().equals(password)) {
                System.out.println("Mật khẩu sai");
                login(scanner, stringLoginMap);
                return;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Đăng nhập thành công");
        System.out.println("Xin chào " + userName);
    }
}
