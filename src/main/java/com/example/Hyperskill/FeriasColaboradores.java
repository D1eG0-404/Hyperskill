package com.example.Hyperskill;

import java.util.Scanner;


public class FeriasColaboradores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of days you will be on holiday: ");
        int holiday = scanner.nextInt();
        System.out.println("Enter the amount spent on food: ");
        int foodCost = scanner.nextInt();
        System.out.println("Enter the amount spent on the airplane ticket: ");
        int FlightCost = scanner.nextInt();
        System.out.println("Enter the hotel's daily rate");
        int hotelCost = scanner.nextInt();

        int numOfFlights = 2;
        int numOfNights = holiday - 1;
        int totalCost = holiday * foodCost + FlightCost * numOfFlights + hotelCost * numOfNights;
        System.out.println("The cost of holidays was: "+ totalCost);

        scanner.close();
    }
}