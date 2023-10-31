package com.example.Hyperskill;

import java.util.Scanner;

public class FirstDigit {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa tem por objetivo pegar o valor de uma dezena e imprimir o primeoro núemero");

        System.out.println("Informe uma dezena 10 à 99: ");
        int number = scanner.nextInt();
        int result = number / 10;

        System.out.println("O primeiro numero é: "+result);

        scanner.close();
    }
}
