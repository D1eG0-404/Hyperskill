package com.example.Hyperskill;

import java.util.Scanner;

public class CheckNumberPositive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa tem como objetico verificar se o número digitado é positivo ou negativo");

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if (num >= 1){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
