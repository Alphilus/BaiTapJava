package com.company;

import com.company.entities.CreateAccount;
import com.company.entities.Login;
import com.company.entities.User;
import com.company.services.CreateAccountService;
import com.company.services.LoginService;
import com.company.services.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        ArrayList<CreateAccount> createAccounts = new ArrayList<>();
        ArrayList<Login> logins = new ArrayList<>();

        UserService.displayMenu(scanner,users, createAccounts);


    }
}
