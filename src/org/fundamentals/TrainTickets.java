package org.fundamentals;

import java.util.Scanner;

public class TrainTickets {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        int travelDistance, passengerAge;
        System.out.print("Travel distance (kms): ");
        travelDistance = Integer.parseInt(scanner.nextLine());

        System.out.print("Passenger age: ");
        passengerAge = Integer.parseInt(scanner.nextLine());

        double pricePerKm = 0.21;
        double juniorDiscount = 0.8;
        double seniorDiscount = 0.6;
        double basePrice = pricePerKm * travelDistance;

        // Apply discount if applicable
        double finalPrice = basePrice;
        if (passengerAge < 18){
            finalPrice = basePrice * juniorDiscount;
        } else if (passengerAge >= 65) {
            finalPrice = basePrice * seniorDiscount;
        }

        // Print ticket price
        System.out.println("Ticket price: " + finalPrice + "€");

        // Close Scanner
        scanner.close();
    }
}
