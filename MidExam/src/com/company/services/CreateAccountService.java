//package com.company.services;
//
//import com.company.entities.CreateAccount;
//import com.company.entities.User;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class CreateAccountService {
//    public CreateAccount inputNewAccount(Scanner scanner,ArrayList<CreateAccount> createAccounts, ArrayList<User> users){
//        System.out.println("Account Creation Menu");
//
//        System.out.println("Create Username:");
//        String newUsername = scanner.nextLine();
//        for (User user : users){
//            if (!newUsername.equals(user.getCurrentUsername())){
//                System.out.println("This username has already exist");
//                return inputNewAccount(scanner, createAccounts ,users);
//            }
//        }
//
//        System.out.println("Email: ");
//        String email = scanner.nextLine();
//        for (User user : users){
//            if (!newUsername.equals(user.getCurrentUsername())){
//                System.out.println("This username has already exist");
//                return inputNewAccount(scanner, createAccounts ,users);
//            }
//        }
//
//        System.out.println("Create Password");
//        System.out.println("(Must be at least 7 - 15 words, including 1 Upper Case, 1 special symbols)");
//        String newPassword = scanner.nextLine();
//
//
//        return new CreateAccount(newUsername, email, newPassword);
//    }
//}
