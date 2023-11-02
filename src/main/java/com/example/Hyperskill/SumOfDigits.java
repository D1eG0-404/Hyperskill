package com.example.Hyperskill;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa tem como objetivo capturar um número inteiro de 3 digitos 100 à 999 \n" +
                "e realizar a soma entre os números.");

        System.out.println("Digite um número entre 100 e 999: ");
        int number = scanner.nextInt();

        int firstNum = number / 100;
        int parceNum = number / 10;
        int secondNum = parceNum % 10;
        int thirdNum = number % 10;

        int result = firstNum + secondNum + thirdNum;
        System.out.println(result);

        scanner.close();

    }
}
