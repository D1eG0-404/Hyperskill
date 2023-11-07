package com.example.Hyperskill;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa tem como objetivo calcular se um ano é bisexto.\n" +
                "Para saber se um ano é bixeto o mesmo deve ser divisível por 4, 400 E NÃO pode ser divisível por 100");
        int year = scanner.nextInt();

        int resul4 = year%4;
        System.out.println(resul4);
        int resul400 = year%400;
        System.out.println(resul400);
        int resul100 = year%100;
        System.out.println(resul100);

        if(year%4==0 && year%100!=0 ||year%400==0){
            System.out.println("Leap");
        }else {
            System.out.println("Regular");
        }
    }
}