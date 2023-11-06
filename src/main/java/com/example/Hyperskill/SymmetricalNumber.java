package com.example.Hyperskill;

import java.util.Scanner;

public class SymmetricalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa tem como objetivo verificar se os números são simétricos");

        System.out.println("Informe um número de quadro dígitos, exemplo 3003: ");
        int num = scanner.nextInt();
        int firstNum = num / 1000;
        System.out.println("O primiero numero é: " + firstNum);
        int parcSecondNum = num % 1000;
        System.out.println("Resultado parcial do segundo numero é: " + parcSecondNum);
        int secondNum = parcSecondNum / 100;
        System.out.println("O segundo número é: " + secondNum);
        int parcThirdNum = parcSecondNum / 10;
        System.out.println("resultado parcial do terceiro número é: " + parcThirdNum);
        int thirdNum = parcThirdNum % 10;
        System.out.println("O terceiro numero é" + thirdNum);
        int fourthNum = num % 10;
        System.out.println("O quarto número é? " + fourthNum);

        if (firstNum == fourthNum && secondNum == thirdNum) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }

        //outra forma de resolver esse execício e na minha opnião seria melhor é:
//        int num = scanner.nextInt();
//        int firstNum,secondNum,thirdNum,fourthNum;
//        firstNum=num % 10;
//        System.out.println("O número é "+firstNum);
//        secondNum=num % 100 / 10;
//        System.out.println("O número é "+secondNum);
//        thirdNum=num % 1000 / 100;
//        System.out.println("O número é " +thirdNum);
//        fourthNum=num % 10000 / 1000;
//        System.out.println("O número é " +fourthNum);
//
//        if (firstNum == fourthNum && secondNum == thirdNum){
//            System.out.println(1);
//        }else {
//            System.out.println(37);
//        }

        scanner.close();
    }
}