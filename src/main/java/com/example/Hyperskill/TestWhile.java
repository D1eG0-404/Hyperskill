package com.example.Hyperskill;

import java.util.Scanner;

public class TestWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
//        char letter = 'D';
//        while (letter <= 'Z'){
//            System.out.print(letter);
//            letter++;
//
//        }
//        int value;
//        do {
//            value = scanner.nextInt();
//            System.out.println(value);
//        }while (value !=0);


//        char letter = 'A';
//        while (letter <='Z'){
//            System.out.println(letter);
//            letter++;
//        }
        int sum =0;
        while (scanner.hasNextInt()){
        int elem = scanner.nextInt();
        sum += elem;
        System.out.println(sum);
    }
//        int i = 5;
//        do {
//            i++;
//            System.out.print(i + " ");
//            i -= 2;
//        } while (i > 1);

//        int valor;
//        do{
//            valor = scanner.nextInt();
//            System.out.println(valor);
//        }while (valor != 0);
    }
//    int sum =0;
//    while (scanner.hasNextInt()){
//        int elem = scanner.nextInt();
//        sum += elem;
//    }
//    System.out.println(sum);

}
