package com.example.Hyperskill;

import java.util.Scanner;

public class OrderByHeight {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa serve para compar a altura de três alunos e dizer se eles estão \n" +
                "em ordem crescente ou decrescente");

        System.out.println("Digite a altura do primeiro aluno");
        int height1 = scanner.nextInt();
        System.out.println("Digite a altura do segundo aluno");
        int height2 = scanner.nextInt();
        System.out.println("Digite a altura do terceiro aluno");
        int height3 = scanner.nextInt();

        boolean result = (height1 <= height2 ) && (height2 <= height3) || (height3 <= height2) && (height2 <= height1);
        System.out.println(result);
        scanner.close();
    }
}
