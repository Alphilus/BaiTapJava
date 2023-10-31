package com.company.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public double inputDouble(Scanner scanner) throws InputMismatchException {
            return Double.parseDouble(scanner.nextLine());
    }
}
