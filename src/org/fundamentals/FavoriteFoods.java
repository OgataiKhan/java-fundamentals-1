package org.fundamentals;

public class FavoriteFoods {
    public static void main(String[] args) {
        String[] favoriteFoods = {"Pizza", "Burger", "Avocado", "Pesto", "Sushi", "Curry"};

        System.out.print("Array length: ");
        System.out.println(favoriteFoods.length);

        System.out.print("Top favorite food: ");
        System.out.println(favoriteFoods[0]);

        System.out.print("Last favorite food: ");
        System.out.println(favoriteFoods[favoriteFoods.length - 1]);

        // Prints second middle element for even arrays
        int middleIndex = favoriteFoods.length / 2;
        System.out.print("Middle favorite food: ");
        System.out.println(favoriteFoods[middleIndex]);

    }
}
