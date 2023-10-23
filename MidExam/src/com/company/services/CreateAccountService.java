package com.company.services;

import com.company.entities.CreateAccount;
import com.company.entities.User;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateAccountService {
    public static void inputNewAccount(Scanner scanner, ArrayList<User> users, ArrayList<CreateAccount> createAccounts) {
        System.out.println("Account Creation Menu");

        System.out.println("Create Username:");
        String newUsername = scanner.nextLine();
        for (User user : users){
            if (newUsername.equals(user.getUsername())){
                System.out.println("This username has already exist");
                inputNewAccount(scanner, users, createAccounts);
            }
        }

        System.out.println("Email: ");
        String newEmail = scanner.nextLine();
        for (User user : users){
            if (newEmail.equals(user.getEmail())){
                System.out.println("This email has already been used");
                inputNewAccount(scanner, users, createAccounts);
            }
        }

        System.out.println("Create Password");
        System.out.println("(Must be at least 7 - 15 words, including 1 Upper Case, 1 special symbols)");

        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{5,17}$";
        Pattern pattern = Pattern.compile(passwordRegex);

        String newPassword = scanner.nextLine();

        Matcher matcher = pattern.matcher(newPassword);

        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password. Must be at least 7 - 15 words, including 1 Upper Case, 1 special symbols");
            inputNewAccount(scanner, users, createAccounts);
        }
        System.out.println("Account creation success");
        User user = new User(newUsername, newPassword , newEmail);
        users.add(user);
    }
}
