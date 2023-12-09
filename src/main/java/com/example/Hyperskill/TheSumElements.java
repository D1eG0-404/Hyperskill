package com.example.Hyperskill;

import java.util.Scanner;

public class TheSumElements {
    public static void  main (String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("este programoa tem como objetivo receber um conjunto de numeros e verificar se o mesmo é uma a 0 \n" +
                "caso seja o progrma deve parar.");

        System.out.println("Digite um número:");
        int sum=0;
        do {
            int num = scanner.nextInt();
            sum+=num;
            System.out.println(sum);
        } while (sum==0);

    }
}