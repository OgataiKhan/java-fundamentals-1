package org.fundamentals;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        String[] invitees = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};

        String user;
        System.out.print("What is your name? ");
        user = scanner.nextLine();

        for (String invitee : invitees) {
            if (user.equals(invitee)) {
                System.out.println("You are on the list. Welcome to the Met Gala!");
                return;
            }
        }

        System.out.println("I am sorry, but you are not on the list.");

        // Close Scanner
        scanner.close();
    }
}
