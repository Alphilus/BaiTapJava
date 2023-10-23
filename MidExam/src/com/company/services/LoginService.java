package com.company.services;

import com.company.entities.CreateAccount;
import com.company.entities.Login;
import com.company.entities.User;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginService {
    public static void inputLogin(Scanner scanner, ArrayList<User> users, ArrayList<CreateAccount> createAccounts) {
        ArrayList<Login> logins = new ArrayList<>();

        System.out.println("Username: ");
        String loginName = scanner.nextLine();

        System.out.println("Password: ");
        String loginPassword = scanner.nextLine();

        Login login = new Login(loginName, loginPassword);
        logins.add(login);


        for (User user : users){
            if (login.getLoginName().equals(user.getUsername()) && login.getLoginPassword().equals(user.getPassword())){
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
                        return;
                    }
                    case 2 -> {
                        changeEmail(scanner,users);
                        return;
                    }
                    case 3 -> {
                        changePassword(scanner,users);
                        return;
                    }
                    case 4 -> UserService.displayMenu(scanner, users,createAccounts);
                    case 0 -> System.exit(0);
                    default -> {
                        System.out.println("Invalid Input");
                        return;
                    }
                }
            } else {
                System.out.println("Wrong username or password");
                System.out.println("1 - Login again");
                System.out.println("2 - Forgot Password");

                int input2 = Integer.parseInt(scanner.nextLine());

                switch (input2) {
                    case 1 -> inputLogin(scanner, users, createAccounts);
                    case 2 -> restorePassword(scanner,users);
                    default -> System.out.println("Invalid Input");
                }
            }
        }
    }

    private static void changeUserName(Scanner scanner, ArrayList<User> users){
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

    private static void changeEmail(Scanner scanner, ArrayList<User> users){
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

    private static void changePassword(Scanner scanner, ArrayList<User> users){
        System.out.println("Enter new password");

        String replacePassword;

        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{5,17}$";
        Pattern pattern = Pattern.compile(passwordRegex);

        replacePassword = scanner.nextLine();

        Matcher matcher = pattern.matcher(replacePassword);

        boolean matchFound = matcher.find();

        for (User user : users){
            if (matchFound){
                System.out.println("Valid password");
                user.setPassword(replacePassword);
            } else {
                System.out.println("Invalid password. Must be at least 7 - 15 words, including 1 Upper Case, 1 special symbols");
                return;
            }
        }
    }

    private static void restorePassword(Scanner scanner, ArrayList<User> users){
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

                boolean matchFound = matcher.find();
                if (matchFound){
                    System.out.println("Valid password");
                } else {
                    System.out.println("Invalid password. Must be at least 7 - 15 words, including 1 Upper Case, 1 special symbols");
                    return;
                }
                user.setPassword(newPassword);
            }
        }
    }
}
