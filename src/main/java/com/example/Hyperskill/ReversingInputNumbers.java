package com.example.Hyperskill;


import java.util.Scanner;

public class ReversingInputNumbers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este progrma tem por objetivos capturar dois numero e imprimir os mesmo número \n" +
                "em ordem invertida");

        System.out.println("Enter a first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number");
        int seconNumber = scanner.nextInt();

        System.out.println(seconNumber+ " " +firstNumber);
    }
}
