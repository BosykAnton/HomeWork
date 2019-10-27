package com.company;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате");
        if (sc.hasNextInt()) {
            String number = sc.nextLine();
            int perevod = Integer.parseInt(number,2);
            System.out.println("Спасибо! Что ввели число в бинарном формате, а в десятичной это будет:");
            System.out.println(perevod);
        }
        else {
            System.out.println("Хм помойму это не число, ввиди число в бинарном формате");
        }
        sc.close();

    }
}