package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TechMasterStudents bizStudent = new BizStudent("Long","Business" , 9, 7);
        TechMasterStudents itStudent = new ITStudent("Thanh", "IT", 7, 5, 8);
        bizStudent.printInfo();
        itStudent.printInfo();
    }
}
