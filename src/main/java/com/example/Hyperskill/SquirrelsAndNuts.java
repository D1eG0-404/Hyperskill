package com.example.Hyperskill;

import java.util.Scanner;

public class SquirrelsAndNuts {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa tem por objetivo dividir em quantidades iguais a quantidade de nozes \n" +
                "entre os esquilos");

        System.out.println("Informe a quantidade de esquilos");
        int squirrel = scanner.nextInt();
        System.out.println("Informe a quantidade de nozes que cada esquilo pegou: ");
        int nuts = scanner.nextInt();

        int allNuts = (nuts % squirrel);

        System.out.println("Quantidade que sobrou é de: "+allNuts);

        scanner.close();
    }
}
