package ua.hillel.samoilyk.homeworks.Homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int attempts = 0;

        int randomNumber = (int) (Math.random()*11);
        System.out.println("Computer number:" + randomNumber);

        while (attempts < 3) {
            System.out.println("Guess the number from 0 to 10");
            int userNumber = scanner.nextInt();
            scanner.nextLine();
            attempts++;

            if (userNumber == randomNumber) {
                System.out.println("You WIN!");
                break;
            } else if (userNumber > randomNumber) {
                System.out.println("Your number is higher than the guess number");
            } else {
                System.out.println("Your number is smaller than the guess number");

                if (attempts == 3) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
                    break;
                }
            }
        }
    }
}
