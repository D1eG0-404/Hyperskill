package com.example.Hyperskill;

import java.util.Scanner;

public class HealthySleep {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("este programa tem como objetivo capturar 3 números interios que representa a quantidade \n" +
                "de horas que uma pessoa dormiu e imprimir se ela dormiu o suficiente, insuficiente ou em excesso");

        System.out.println("informe a quantidade mínima de horas que você deve dormir: ");
        int A = scanner.nextInt();
        System.out.println("Informe a quantidade máxima de horas que você deveria dormir: ");
        int B = scanner.nextInt();
        System.out.println("Informe a quantidade de horas que você dormiu: ");
        int H = scanner.nextInt();

        if (H < A) {
            System.out.println("Deficiency");
        }else if (H > B) {
            System.out.println("Excess");
        }else {
            System.out.println("Normal");
        }

        scanner.close();

    }
}
