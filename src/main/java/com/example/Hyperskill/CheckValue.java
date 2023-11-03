package com.example.Hyperskill;

import java.util.Scanner;

public class CheckValue {
    public static void main (String[] arqs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa tem como objetivo verificar se o número digitado é menor q dez e maior que zero");

        System.out.println("Digite um valor: ");
        int num = scanner.nextInt();

        boolean result = (num < 10) && (num > 0);
        System.out.println(result);

        scanner.close();

    }
}
