package com.company;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и нажмите Enter:");
        int number = scanner.nextInt();

        final int A = 5;
        final int B = 15;
        final int C = 32;


        switch (number) {
            case A:
            case B:
            case C:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;

        }
    }
}
