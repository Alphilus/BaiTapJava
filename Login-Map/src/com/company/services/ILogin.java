package com.company.services;

import java.util.Map;
import java.util.Scanner;

public interface ILogin<T> {
    void register(Scanner scanner, Map<String, T> stringTMap);
    void login(Scanner scanner, Map<String, T> stringTMap);
}
