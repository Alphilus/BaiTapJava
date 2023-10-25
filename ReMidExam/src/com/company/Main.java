package com.company;

import com.company.entities.User;
import com.company.services.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        UserService userService = new UserService();
        userService.loginMenu(scanner, users);
    }
}
