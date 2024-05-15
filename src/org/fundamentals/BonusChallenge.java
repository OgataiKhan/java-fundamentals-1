package org.fundamentals;

import java.util.Scanner;

public class BonusChallenge {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        // User input
        String userString;
        System.out.print("Enter a string: ");
        userString = scanner.nextLine();

        char userCharacter;
        System.out.print("Enter a character: ");
        userCharacter = scanner.nextLine().charAt(0);

        // Define support variables
        int longestStringLength = 0;
        int currentStringLength = 0;
        int startIndex = -1;
        int tempIndex = -1;

        // Loop through array
        for (int i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) == userCharacter) {
                if (currentStringLength == 0) {
                    tempIndex = i;
                }
                currentStringLength++;
                if (currentStringLength >= longestStringLength) {
                    longestStringLength = currentStringLength;
                    startIndex = tempIndex;
                }
            } else {
                currentStringLength = 0;
            }
        }

        // Print results
        System.out.println("Your string: " + userString);
        System.out.println("Your character: " + userCharacter);
        System.out.println("Longest consecutive string of your character: " + longestStringLength);
        System.out.println("Starting index: " + startIndex);

        // Close Scanner
        scanner.close();
    }
}
