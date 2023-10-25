package com.company.services;

import com.company.entities.User;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {
    public void loginMenu(Scanner scanner, ArrayList<User> users){
        System.out.println("Menu:");
        System.out.println("1. Login");
        System.out.println("2. Create an account");
        System.out.println("3. Exit");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1 -> loginInput(scanner, users);
            case 2 -> createUser(scanner, users);
            case 3 -> System.exit(0);
            default -> {
                System.out.println("Invalid choice.");
                loginMenu(scanner, users);
            }
        }
    }

    private User findUserForLogin(String username, String password, ArrayList<User> users){
        for (User user : users){
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    private User checkForNewAccount(String username, String password ,String email ,ArrayList<User> users){
        for (User user : users){
            if (user.getUsername().equals(username) && user.getPassword().equals(password) && user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    private User checkUsername(String username, ArrayList<User> users){
        for (User user : users){
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }


    private User checkEmail(String email ,ArrayList<User> users){
        for (User user : users){
            if (user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    public void createUser(Scanner scanner, ArrayList<User> users){
        System.out.println("Account Creation Menu");

        System.out.println("Create Username:");
        String username = scanner.nextLine();


        System.out.println("Email: ");
        String email = scanner.nextLine();


        System.out.println("Create Password");
        System.out.println("(Must be at least 7 - 15 words, including 1 Upper Case, 1 special symbols)");

        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{5,17}$";
        Pattern pattern = Pattern.compile(passwordRegex);

        String password = scanner.nextLine();

        Matcher matcher = pattern.matcher(password);

        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password. Must be at least 7 - 15 words, including 1 Upper Case, 1 special symbols");
            createUser(scanner, users);
        }

        User user = new User(username, password, email);
        User checkExits = checkForNewAccount(username, password, email, users);

        if (checkExits == null){
            System.out.println("Account creation success");
            users.add(user);
            loginMenu(scanner, users);
        } else {
            System.out.println("This account has already exist");
            createUser(scanner, users);
        }
    }

    public void loginInput(Scanner scanner, ArrayList<User> users){
        System.out.println("Username: ");
        String loginName = scanner.nextLine();

        System.out.println("Password: ");
        String loginPassword = scanner.nextLine();

        User checkAccount = findUserForLogin(loginName, loginPassword, users);
        if (checkAccount == null){
            System.out.println("Unable to login: Wrong username or password");
            wrongUserOrPassword(scanner, users);
        }
        System.out.println("Login Success");
        userMenu(scanner, users);

    }

    public void userMenu(Scanner scanner, ArrayList<User> users){
        System.out.println("Login Successful");

        System.out.println("Welcome, you can do the following:");

        System.out.println("1 - Change username");
        System.out.println("2 - Change email");
        System.out.println("3 - Change password");
        System.out.println("4 - Log out");
        System.out.println("0 - Exit the program");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1 -> changeUserName(scanner, users);
            case 2 -> changeEmail(scanner, users);
            case 3 -> changePassword(scanner, users);
            case 4 -> loginMenu(scanner, users);
            case 0 -> System.exit(0);
            default -> {
                System.out.println("Invalid Input");
                userMenu(scanner, users);
            }
        }
    }

    private void changeUserName(Scanner scanner, ArrayList<User> users){
        for (User user : users) {
            String newUserName;
            System.out.println("Enter new name: ");
            newUserName = scanner.nextLine();

            User newUser = checkUsername(newUserName, users);
            if (newUser == null) {
                System.out.println("Change Success");
                user.setUsername(newUserName);
            } else {
                System.out.println("This username is being used");
            }
            userMenu(scanner, users);
        }
    }

    private void changeEmail(Scanner scanner, ArrayList<User> users){
        for (User user : users) {
            String newEmail;
            System.out.println("Enter new email: ");
            newEmail = scanner.nextLine();

            User changeEmail = checkEmail(newEmail, users);
            if (changeEmail == null) {
                System.out.println("Change Success");
                user.setUsername(newEmail);
            } else {
                System.out.println("This email is already being used");
            }
            userMenu(scanner, users);
        }
    }

    private void changePassword(Scanner scanner, ArrayList<User> users) {
        for (User user : users) {
            System.out.println("Enter new password");

            String replacePassword;

            String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{5,17}$";
            Pattern pattern = Pattern.compile(passwordRegex);

            replacePassword = scanner.nextLine();

            Matcher matcher = pattern.matcher(replacePassword);

            boolean matchFound = matcher.find();

            if (matchFound) {
                System.out.println("Valid password");
                user.setPassword(replacePassword);
            } else {
                System.out.println("Invalid password. Must be at least 7 - 15 words, including 1 Upper Case, 1 special symbols");
                changePassword(scanner, users);
            }
            userMenu(scanner, users);
        }
    }

    private void wrongUserOrPassword(Scanner scanner, ArrayList<User> users) {
        System.out.println("Wrong username or password");
        System.out.println("1 - Login again");
        System.out.println("2 - Forgot Password");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1 -> loginInput(scanner, users);
            case 2 -> restorePassword(scanner,users);
            default -> System.out.println("Invalid Input");
        }
    }

    private void restorePassword(Scanner scanner, ArrayList<User> users){
        System.out.println("Password Recovery");
        System.out.println("Please enter your email to recover the password: ");

        String recoverEmail = scanner.nextLine();

        User changeEmail = checkEmail(recoverEmail,users);
        if (changeEmail == null){
            System.out.println("Email doesn't exist");
            restorePassword(scanner, users);
        } else {
            for (User user : users) {
                System.out.println("Please create a new password: ");
                String passwordRegex = "(?=.*[A-Z])(?=.*[@#$%^&*()-+=])\\w{7,15}";
                Pattern pattern = Pattern.compile(passwordRegex);

                String newPassword = scanner.nextLine();

                Matcher matcher = pattern.matcher(newPassword);

                boolean matchFound = matcher.find();
                if (matchFound) {
                    System.out.println("Valid password");
                    user.setPassword(newPassword);
                    loginMenu(scanner, users);
                } else {
                    System.out.println("Invalid password. Must be at least 7 - 15 words, including 1 Upper Case, 1 special symbols");
                    restorePassword(scanner, users);
                }
            }
        }
    }
}
