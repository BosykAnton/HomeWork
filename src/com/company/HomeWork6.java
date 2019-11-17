package com.company;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x и нажмите Enter:");
        int x = scanner.nextInt();
        System.out.println("Введите число y и нажмите Enter:");
        int y = scanner.nextInt();
        System.out.println("Введите число z и нажмите Enter:");
        int z = scanner.nextInt();
        int a = (x + y + z) / 3;
        System.out.println("Среднее арифметическое x,y,z = " + a);
        int b = a / 2;
        System.out.println("Деление среднего арифметического на 2 = " + b);
        if (b > 3)
        {
            System.out.println("Программа выполнена корректно(" + b + " > 3)");
        }
    }
}
