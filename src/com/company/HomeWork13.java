package com.company;

import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку: ");
        String str1 = scanner.nextLine();

        System.out.println("Введите вторую строку: ");
        String str2 = scanner.nextLine();

        System.out.println(str1.length() == str2.length() ? "Длина 1-ой строки равна длине 2-ой строки" :
                str1.length() < str2.length() ? "Строка с наибольшей длинной: " + str2 : "Строка с наибольшей длинной: " + str1);
    }
}
