package org.fundamentals;

import java.util.Scanner;

public class BonusChallenge {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        String userString;
        System.out.print("Enter a string: ");
        userString = scanner.nextLine();

        char userCharacter;
        System.out.print("Enter a character: ");
        userCharacter = scanner.nextLine().charAt(0);

        char charToExamine;
        int longestStringLength = 0;
        int startIndex = 0;

        for (int i = 0; i < userString.length(); i++) {
            charToExamine = userString.charAt(i);
            int currentStringLength = 0;
            if (charToExamine == userCharacter){
                for (int j = i; j < userString.length(); j++) {
                    if (userString.charAt(j) == userCharacter){
                        currentStringLength++;
                    } else {
                        break;
                    }
                }
                if (currentStringLength > longestStringLength){
                    longestStringLength = currentStringLength;
                    startIndex = i;
                }
            }

        }

        System.out.println("Your string: " + userString);
        System.out.println("Your character: " + userCharacter);
        System.out.println("Longest consecutive string of your character: " + longestStringLength);
        System.out.println("Starting index: " + startIndex);

        // Close Scanner
        scanner.close();
    }
}
