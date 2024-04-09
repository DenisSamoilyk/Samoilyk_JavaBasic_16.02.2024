package ua.hillel.samoilyk.homeworks.Homework17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean ordering = true;

        // Зациклювання коду
        while (ordering) {

            // Питання на вибір напою
            System.out.println("1. COFFEE\n2. TEA\n3. LEMONADE\n4. MOJITO\n5. MINERAL_WATER\n6. COCA_COLA");
            System.out.print("Choose drink: ");
            String choice = scanner.nextLine();

            DrinksMachine drinkChoice;

            // Switch Case на вибір напою
            switch (choice.toLowerCase()) {
                case "1", "coffee":
                    drinkChoice = DrinksMachine.COFFEE;
                    break;

                case "2", "tea":
                    drinkChoice = DrinksMachine.TEA;
                    break;

                case "3", "lemonade":
                    drinkChoice = DrinksMachine.LEMONADE;
                    break;

                case "4", "mojito":
                    drinkChoice = DrinksMachine.MOJITO;
                    break;

                case "5", "mineral water", "mineral", "water":
                    drinkChoice = DrinksMachine.MINERAL_WATER;
                    break;

                case "6", "coca cola", "coca", "cola":
                    drinkChoice = DrinksMachine.COCA_COLA;
                    break;

                default:
                    System.out.println("Error. Invalid choice.");
                    continue;
            }

            int numberOfDrinks = 0;

            // Повторення циклу, якщо не правильно
            while (numberOfDrinks <= 0) {
                System.out.println("How much " + drinkChoice + " do you want to order?");

                if (scanner.hasNextInt()) {
                    // Питання на кількість напоїв
                    numberOfDrinks = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    System.out.println("Error. Invalid number.");
                    scanner.nextLine();
                }
            }

            // Приготування напоїв та розрахунок вартості
            for (int i = 0; i < numberOfDrinks; i++) {
                Drinks.prepareDrink(drinkChoice);
            }

            // Питання на повторення циклу
            System.out.println("Would you like to order more drinks? (Yes/No)");
            String answer = scanner.next().toLowerCase();
            if (!answer.equalsIgnoreCase("yes")) {
                ordering = false;
            }
        }


        // Виведення кількості виготовлених напоїв та загальної суми
        System.out.println("Total drinks sold: " + Drinks.getTotalDrinksSold());
        System.out.println("Total revenue: " + Drinks.getTotalRevenue() + "$");


    }
}
