package com.company;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод строки с пробелами: ");
        String str = scanner.nextLine();
        String changeStr = str.replace(" ","");

        System.out.print("Вывод строки без пробелов: " + changeStr);
    }
}
