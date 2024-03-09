package ua.hillel.samoilyk.homeworks.Homework10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Зміна кількості чисел користувача та фірми
        int amountOfNumbers = 7;

        int[] firmArray = new int[amountOfNumbers];
        int[] userArray = new int[amountOfNumbers];

        for (int i = 0; i < amountOfNumbers; i++) {
            // Рандомне число фірми
            int firmRandomNumber = (int) (Math.random() * 10);
            firmArray[i] = firmRandomNumber;

            // Рандомне число корустувача
            int userRandomNumber = (int) (Math.random() * 10);
            userArray[i] = userRandomNumber;
        }

        // Сортування масиву фірми
        Arrays.sort(firmArray);
        System.out.println(Arrays.toString(firmArray));

        // Сортування масиву користувача
        Arrays.sort(userArray);
        System.out.println(Arrays.toString(userArray));

        int counter = 0;

        // Знаходження однакових індексів
        for (int i = 0; i < amountOfNumbers; i++) {
            if (firmArray[i] == userArray[i]) {
                System.out.println("Збігів за числами в індексах: " + i);
                counter++;
            }
        }
        // Якщо збігів нема писати    ↓
        if (counter == 0) {
            System.out.println("Збігів немає");
        }


    }
}
