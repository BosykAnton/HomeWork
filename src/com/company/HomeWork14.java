package com.company;

import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String s = scanner.nextLine();
        int x = Integer.parseInt(s);
        double y = x;
        System.out.println("Значение типа String: " + '"' + s + '"');
        System.out.println("Значение типа int: " +  x);
        System.out.println("Значение типа double: " + y);
    }
}
