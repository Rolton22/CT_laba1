package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Введите число 10-ой системы счиления:");
        long number10 = scan.nextLong();
        System.out.println("Перевод с помощью встроенных функций джавы : " + Integer.toOctalString(Integer.parseInt(String.valueOf(number10), 10)));
        System.out.println("Число переведенно в 8-ю систему счисления: " + laba1(number10));
    }

    public static String laba1(Long number10) {


        long number8 = 0;
        String temp = "";

        while (number10 != 0) {
            number8 = number10 % 8;
            number10 = number10 / 8;
            temp = number8 + temp;
        }

        return temp;
    }
}