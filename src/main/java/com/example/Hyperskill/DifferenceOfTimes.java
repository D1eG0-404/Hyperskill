package com.example.Hyperskill;

import java.util.Scanner;

public class DifferenceOfTimes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa irá lhe informa quantos segudos se passou em um determinado intervalo");

        System.out.println("Para começar preciso que você informe a hora \n" +
                "do primeiro intervalo");

        System.out.println("Digite a hora: ");
        int fristHour = scanner.nextInt();

        System.out.println("Digite os minutos: ");
        int fristMinutes = scanner.nextInt();

        System.out.println("Digite os segudos");
        int firstSecond = scanner.nextInt();

        //conversão para segundos do primeiro intervalo capturado.
        int convHour = fristHour * 60;
        int allMinutes = convHour + fristMinutes;
        int convMinutes = allMinutes * 60;
        int allFirstSeconds = convMinutes + firstSecond;


        System.out.println("Muito bem! Agora preciso que você informe o segundo intevalo de tempo \n" +
                "para que o programa realize o calculo de quantos secundos se passo nesse intervalo");

        System.out.println("Digite a hora: ");
        int seconHour = scanner.nextInt();

        System.out.println("Digite os minutos: ");
        int seconMinutes = scanner.nextInt();

        System.out.println("Digite os segudos");
        int seconSecond = scanner.nextInt();

        //conversão para segundos do segundo intervalo capturado.

        int convSeconHour = seconHour * 60;
        int allSeconMinutes = convSeconHour + seconMinutes;
        int convSeconMinutes = allSeconMinutes * 60;
        int allSeconSeconds = convSeconMinutes + seconSecond;

        int diffOfTime = allSeconSeconds - allFirstSeconds;

        System.out.println("A quantidade de segundos decorrido entre os dois intervalos fornecidos foi de: " +diffOfTime);

        scanner.close();
    }
}
