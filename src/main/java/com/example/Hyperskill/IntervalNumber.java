package com.example.Hyperskill;

import java.util.Scanner;

public class IntervalNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if (-15 < num && num <= 12){
            System.out.println("True1");
        } else if (-14 < num && num < 17){
            System.out.println("True2");
        } if (19 <= num){
            System.out.println("True3");
        } else{
            System.out.println("False");
        }
        scanner.close();
    }
}
