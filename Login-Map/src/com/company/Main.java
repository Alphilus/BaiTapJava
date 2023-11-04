package com.company;

import com.company.entities.Login;
import com.company.services.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Map<String, Login> stringLoginMap = new HashMap<>();
        Menu menu = new Menu();
        menu.inputMenu(scanner,stringLoginMap);

    }
}
