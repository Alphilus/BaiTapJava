package com.company.services;

import com.company.entities.User;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService{
    public void displayMenu(Scanner scanner, ArrayList<User> users){
        System.out.println("Menu:");
        System.out.println("1. Login");
        System.out.println("2. Create an account");
        System.out.println("3. Exit");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1 -> inputLogin(scanner, users);
            case 2 -> inputNewAccount(scanner, users);
            case 3 -> System.exit(0);
            default ->{
                System.out.println("Invalid choice.");
                displayMenu(scanner,users);
            }

        }

    }

    private void inputNewAccount(Scanner scanner, ArrayList<User> users) {
        System.out.println("Account Creation Menu");
        String username;
        String email;
        String password;


        System.out.println("Create Username:");
        username = scanner.nextLine();
        for (User user : users){
            if (username.equals(user.getUsername())){
                System.out.println("This username has already exist");
                inputNewAccount(scanner, users);
            }
        }

        System.out.println("Email: ");
        email = scanner.nextLine();
        for (User user : users){
            if (email.equals(user.getEmail())){
                System.out.println("This email has already been used");
                inputNewAccount(scanner, users);
            }
        }

        System.out.println("Create Password");
        System.out.println("(Must be at least 7 - 15 words, including 1 Upper Case, 1 special symbols)");

        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{5,17}$";
        Pattern pattern = Pattern.compile(passwordRegex);

        password = scanner.nextLine();

        Matcher matcher = pattern.matcher(password);

        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password. Must be at least 7 - 15 words, including 1 Upper Case, 1 special symbols");
            inputNewAccount(scanner, users);
        }

        User user = new  User(username, email, password);
        users.add(user);
        displayMenu(scanner,users);
    }
    
    private void inputLogin(Scanner scanner, ArrayList<User> users) {
        String loginName;
        System.out.println("Username: ");
        loginName = scanner.nextLine();

        String loginPassword;
        System.out.println("Password: ");
        loginPassword = scanner.nextLine();

        for (User user : users){
            if (loginName.equals(user.getUsername()) && loginPassword.equals(user.getPassword())){
                System.out.println("Login Successful");

                System.out.println("Welcome " + loginName + " you can do the following:");

                System.out.println("1 - Change username");
                System.out.println("2 - Change email");
                System.out.println("3 - Change password");
                System.out.println("4 - Log out");
                System.out.println("0 - Exit the program");

                int input = Integer.parseInt(scanner.nextLine());

                switch (input) {
                    case 1 -> {
                        changeUserName(scanner,users);
                        inputLogin(scanner, users);
                    }
                    case 2 -> {
                        changeEmail(scanner,users);
                        inputLogin(scanner, users);
                    }
                    case 3 -> {
                        changePassword(scanner,users);
                        inputLogin(scanner, users);
                    }
                    case 4 -> displayMenu(scanner, users);
                    case 0 -> System.exit(0);
                    default -> {
                        System.out.println("Invalid Input");
                        inputLogin(scanner, users);
                    }
                }
            } else {
                System.out.println("Wrong username or password");
                System.out.println("1 - Login again");
                System.out.println("2 - Forgot Password");

                int input2 = Integer.parseInt(scanner.nextLine());

                switch (input2) {
                    case 1 -> inputLogin(scanner, users);
                    case 2 -> restorePassword(scanner,users);
                    default -> System.out.println("Invalid Input");
                }
            }
        }

    }

    private void changeUserName(Scanner scanner, ArrayList<User> users){
        String newUserName;
        System.out.println("Enter new name: ");
        newUserName = scanner.nextLine();

        for (User user: users){
            if (newUserName.equals(user.getUsername())){
                System.out.println("This username is being used");
                changeUserName(scanner, users);
            } else {
                user.setUsername(newUserName);
                break;
            }
        }
    }

    private void changeEmail(Scanner scanner , ArrayList<User> users){
        String newEmail;
        System.out.println("Enter new email: ");
        newEmail = scanner.nextLine();

        for (User user : users){
            if (newEmail.equals(user.getEmail())){
                System.out.println("This email is already being used");
                changeEmail(scanner, users);
            } else {
              user.setEmail(newEmail);
            }
        }
    }

    private void changePassword(Scanner scanner, ArrayList<User> users){
        System.out.println("Enter new password");

        String replacePassword;

        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{5,17}$";
        Pattern pattern = Pattern.compile(passwordRegex);

        replacePassword = scanner.nextLine();

        Matcher matcher = pattern.matcher(replacePassword);

        boolean matchFound = matcher.find();

        for (User user : users){
            if (replacePassword.equals(user.getPassword())){
                System.out.println("This password had already exist");
                changePassword(scanner, users);
            } else if (matchFound){
                System.out.println("Valid password");
                user.setPassword(replacePassword);
            }else {
                System.out.println("Invalid password. Must be at least 7 - 15 words, including 1 Upper Case, 1 special symbols");
                changePassword(scanner, users);
            }
        }
    }

    private void restorePassword(Scanner scanner, ArrayList<User> users){
        String recoverEmail;
        System.out.println("Password Recovery");
        System.out.println("Please enter your email to recover the password: ");
        recoverEmail = scanner.nextLine();
        for (User user : users){
            if (recoverEmail.equals(user.getEmail())){
                System.out.println("Please create a new password: ");
                String passwordRegex = "(?=.*[A-Z])(?=.*[@#$%^&*()-+=])\\w{7,15}";
                Pattern pattern = Pattern.compile(passwordRegex);

                String newPassword = scanner.nextLine();

                Matcher matcher = pattern.matcher(newPassword);

                if (!matcher.matches()){
                    System.out.println("Invalid password. Must be at least 7 - 15 words, including 1 Upper Case, 1 special symbols");
                    restorePassword(scanner, users);
                }else {
                    System.out.println("Valid password");
                    user.setPassword(newPassword);
                }
            }
        }
    }
}
