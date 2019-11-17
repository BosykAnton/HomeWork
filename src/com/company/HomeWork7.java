package com.company;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и нажмите Enter:");
        int number = scanner.nextInt();

        switch (number) {
            case 5:
            case 15:
            case 32:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;

        }
    }
}
