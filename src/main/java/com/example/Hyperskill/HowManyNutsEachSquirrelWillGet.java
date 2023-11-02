package com.example.Hyperskill;

import java.util.Scanner;

public class HowManyNutsEachSquirrelWillGet {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estre programa tem como objetivo capturar a quantidade de esquilo e nozes e dividir as nozes igualmente \n" +
                " entre os esquilos");

        System.out.println("informe a quantidade de nozes");
        int nuts = scanner.nextInt();

        System.out.println("informe a quandade de esquilios");
        int squirrels = scanner.nextInt();

        int result = nuts / squirrels;
        System.out.println("Cada esquilo terá "+ result+ "nozes");

        scanner.close();

    }
}
