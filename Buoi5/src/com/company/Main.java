package com.company;

import java.util.Scanner;

public class Main {
//    Bài 1
//    public static void main(String[] args) {
//	// write your code here
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Phần tủ được thay thế là: " + Arrays.toString(arrayReplace(scanner)));
//    }
//
//    public  static int[] arrayReplace(Scanner scanner){
//        int[] arrNumber = {1, 2, 4, 0, 1, 3};
//        System.out.println("Phần tủ lúc đầu là: " + Arrays.toString(arrNumber));
//
//        for (int i = 0 ; i < arrNumber.length; i++) {
//            System.out.println("Mời bạn thêm một phần tủ vào:");
//            i = Integer.parseInt(scanner.nextLine());
//            arrNumber[1] = i;
//        }
//
//        for (int j = 0 ; j < arrNumber.length; j++) {
//            System.out.println("Mời bạn thêm một phần tủ vào:");
//            j = Integer.parseInt(scanner.nextLine());
//            arrNumber[2] = j;
//        }
//        return arrNumber;
//    }

//    Bài 2
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tổng của 2 ma trận là: " + arrMerge(scanner));

    }

    public static int arrMerge(Scanner scanner){
        System.out.println("Nhập số cột A:");
        int columnA = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng A:");
        int rowA = Integer.parseInt(scanner.nextLine());

        int matrixA[][] = new int[rowA][columnA];

        System.out.println("Nhập số cột B:");
        int columnB = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng B:");
        int rowB = Integer.parseInt(scanner.nextLine());
        int matrixB[][] = new int[rowB][columnB];

        int sum = 0;

        if (rowA == rowB && columnA == columnB){
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.println("Dòng thứ: " + (i + 1) + " Cột Thứ: " + (j + 1));
                    matrixA[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.print(matrixA[i][j] + "\t");
                }
                System.out.println();
            }

            for (int k = 0; k < rowB; k++) {
                for (int l = 0; l < columnB; l++) {
                    System.out.println("Dòng thứ: " + (k + 1) + " Cột Thứ: " + (l + 1));
                    matrixB[k][l] = Integer.parseInt(scanner.nextLine());
                }
            }
            for (int k = 0; k < rowB; k++) {
                for (int l = 0; l < columnB; l++) {
                    System.out.print(matrixB[k][l] + "\t");
                }
                System.out.println();
            }

            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                            sum += matrixA[i][j];
                }
            }

            for (int k = 0; k < rowB; k++) {
                for (int l = 0; l < columnB; l++) {
                    sum += matrixB[k][l];
                }
            }
        } else System.out.println("không thể thực hiện");
        return sum;
    }
}
